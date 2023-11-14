/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.example.model.undomachine;


import java.util.ArrayList;
import java.util.Observable;
import org.example.controller.action.ActionInterface;

/**
 *
 * @author Wera
 */
public class UndoMachine extends Observable {
    public enum UndoRedoButtonState {

    EUndoERedo(true, true), DUndoDRedo(false, false), EUndoDRedo(true, false), DUndoERedo(false, true);
    public boolean undo;
    public boolean redo;

    UndoRedoButtonState(boolean u, boolean r) {
        undo = u;
        redo = r;
    }
}
    private class StateDUndoDRedo extends UndoRedoState {

        public StateDUndoDRedo() {
            super(UndoRedoButtonState.DUndoDRedo);
        }
        
        @Override
        public void undo() {
        }

        @Override
        public void redo() {
        }

        @Override
        void goToEUndoERedo() {
        }

        @Override
        void deleteHistory() {
        }
    }

    private class StateDUndoERedo extends UndoRedoState {

        public StateDUndoERedo() {
            super(UndoRedoButtonState.DUndoERedo);
        }

        @Override
        public void undo() {
        }
    }

    private class StateEUndoDRedo extends UndoRedoState {

        public StateEUndoDRedo() {
            super(UndoRedoButtonState.EUndoDRedo);
        }

        @Override
        public void redo() {
        }

        @Override
        void deleteHistory() {
        }
    }

    private class StateEUndoERedo extends UndoRedoState {

        public StateEUndoERedo() {
            super(UndoRedoButtonState.EUndoERedo);
        }

        @Override
        void goToEUndoERedo() {
        }
    }

    private class UndoRedoState {
        
        UndoRedoButtonState buttonState;

        public UndoRedoState(UndoRedoButtonState buttonState) {
            this.buttonState = buttonState;
        }

        public UndoRedoButtonState getButtonState() {
            return buttonState;
        } 
        
        void undo() {
            activityList.get(undoIterator).unexecute();
            undoIterator--;
            if (undoIterator == -1) {
                state = stateDUndoERedo;
                notifyMenu();
            } else {
                goToEUndoERedo();
            }
        }

        void redo() {
            undoIterator++;
            activityList.get(undoIterator).execute();
            if (undoIterator == activityList.size() - 1) {
                state = stateEUndoDRedo;
                notifyMenu();
            } else {
                goToEUndoERedo();
            }
        }

        final void add(ActionInterface action) {
            deleteHistory();
            activityList.add(action);
            undoIterator++;
            state = stateEUndoDRedo;
            notifyMenu();
        }

        void goToEUndoERedo() {
            state = stateEUndoERedo;
            notifyMenu();
        }

        void deleteHistory() {
            if (!activityList.isEmpty()) {
//                activityList.removeAll(activityList);
//                undoIterator = -1;
                for (int i = undoIterator; i < activityList.size(); i++) {
                    activityList.remove(i);
                }
            }
        }
    }
    ArrayList<ActionInterface> activityList;
    
    UndoRedoState stateDUndoDRedo;
    UndoRedoState stateEUndoERedo;
    UndoRedoState stateDUndoERedo;
    UndoRedoState stateEUndoDRedo;
    UndoRedoState state;
    int undoIterator;

    public UndoMachine() {

        activityList = new ArrayList<>();
        stateDUndoDRedo = new StateDUndoDRedo();
        stateEUndoERedo = new StateEUndoERedo();
        stateDUndoERedo = new StateDUndoERedo();
        stateEUndoDRedo = new StateEUndoDRedo();
        state = stateDUndoDRedo;
        undoIterator = -1;
    }

    public void add(ActionInterface action) {
        state.add(action);
    }

    public void execute() {
        state.redo();
    }

    public void unexecute() {
        state.undo();
    }

    public void notifyMenu() {
        setChanged();
        notifyObservers(state.getButtonState());
    }
}
