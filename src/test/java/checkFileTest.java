import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class checkFileTest {
    private Solution solution;
    @BeforeEach
    void init(){
        solution = new Solution();
    }

    @Test
    public void testCheckFile(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("3");
        list.add("5");
        list.add("8");
        list.add("15");

        final File mockedFile = Mockito.mock(File.class);
        Mockito.when(mockedFile.getName()).thenReturn("my_file_name");

        final Solution mockedSolution = Mockito.mock(Solution.class);
        Mockito.when(mockedSolution.readFile(mockedFile.getName())).thenReturn(list);

        assertTrue(mockedSolution.checkFile(mockedSolution.readFile(mockedFile.getName())));
    }
}