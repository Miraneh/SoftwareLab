import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChenarTest {

    @Test
    void printTree() {
        AbstractGardenCreator gardenCreator = Client.getGarden("Iranian");
        AbstractTree tree1 = gardenCreator.setTree();
        assertEquals(tree1.printTree(), "Inside Chenar::printTree() method");
    }
}