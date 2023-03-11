//package array;
//import org.junit.jupiter.api.DisplayName;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//public class ArrayStackTest {
//    ArrayStack<String> stack;
//
//    @BeforeMethod
//    public void setUp() {
//        stack = new ArrayStack<String>();
//    }
//
//    @Test
//    void testArraySizeIsZeroOnCreation(){
//        assertThat(stack.size()).isZero();
//        assertThat(stack.isEmpty()).isTrue();
//    }
//
//    @Test
//    void testPushSingleItemOnTheStackAndPeek() {
//        final String itemPushed = "a";
//        stack.push(itemPushed);
//        assertThat(stack.size()).as("Stack Size").isEqualsTo(1);
//        assertThat(stack.peek()).isEqualsTo(itemPushed);
//    }
//
//    @Test
//    @DisplayName("Single Item Pushed and then Popped")
//    void testPushSingleItemOnTheStackAndPop() {
//        final String itemPushed = "a";
//        stack.push(itemPushed);
//        assertThat(stack.size()).as("Stack Size").isEqualsTo(1);
//        assertThat(stack.pop()).isEqualsTo(itemPushed);
//        assertThat(stack.size()).as("Stack Size").isZero();
//    }
//
//    @Test
//    void testPeekShouldThrowAnExceptionOnEmptyStack() throws Exception {
//        assertThatExceptionOfType(ArrayStack.StackIsEmptyException.class)
//                .isThrownBy(() -> stack.peek());
//    }
//
//    @Test
//    void testPopShouldThrowAnExceptionOnEmptyStack() throws Exception {
//        assertThatExceptionOfType(ArrayStack.StackIsEmptyException.class)
//                .isThrownBy(() -> stack.pop());
//}