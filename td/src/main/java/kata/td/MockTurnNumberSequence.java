package kata.td;

/**
 * Created by switch on 16/7/1.
 */
public class MockTurnNumberSequence extends TurnNumberSequence {
    private int nextTurnNumber;

    public void arrangeNextTurnNumber(int nextTurnNumber) {
        this.nextTurnNumber = nextTurnNumber;
    }

    // TODO: Finish the implementation of method MockTurnNumberSequence.verifyMethodGetNextTurnNumberCalledOnce().
    public void verifyMethodGetNextTurnNumberCalledOnce() {

    }

    @Override
    public int getNextTurnNumber() {
        return this.nextTurnNumber;
    }
}
