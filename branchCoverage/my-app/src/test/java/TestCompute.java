import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {


    @Test
    public void testCountNumberOfOccurrences() {
        // Mock MessageQueue
        MessageQueue messageQueue = mock(MessageQueue.class);
        when(messageQueue.size()).thenReturn(4); // Set the size of the queue
        when(messageQueue.contains("test")).thenReturn(true); // Set a message to be contained in the queue
        when(messageQueue.getAt(anyInt())).thenReturn("test"); // Set the message to be retrieved
        
        // Create Compute instance with the mocked MessageQueue
        Compute compute = new Compute(messageQueue);

        // Test when the message exists in the queue
        assertEquals(4, compute.countNumberOfOccurrences("test"));

        // Test when the message does not exist in the queue
        assertEquals(0, compute.countNumberOfOccurrences("notPresent"));

        // Test when the queue is empty
        when(messageQueue.size()).thenReturn(0);
        assertEquals(-1, compute.countNumberOfOccurrences("test"));
    }
}





