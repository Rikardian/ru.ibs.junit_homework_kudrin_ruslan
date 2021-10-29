import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionTest {
    private Solution solution;
    @BeforeEach
    void init(){
        solution = new Solution();
    }

    @Test
    public void testException(){
        File mockedFile = Mockito.mock(File.class);
        Mockito.when(mockedFile.getName()).thenReturn("my_file_name");

        assertEquals("Файл не найден!", solution.readFile(mockedFile.getName()));
    }
}