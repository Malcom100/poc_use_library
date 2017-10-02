package adneom.poc_library;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import adneom.poc_library.preview.PreviewContract;
import adneom.poc_library.preview.PreviewFragment;
import adneom.poc_library.preview.PreviewPresenetr;

/**
 * Created by gtshilombowanticale on 19-06-17.
 */

@RunWith(MockitoJUnitRunner.class)
public class PreviewPresenetrTest {

    private PreviewPresenetr previewPresneetr;
    private PreviewFragment view;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        view = Mockito.mock(PreviewFragment.class);
        previewPresneetr = new PreviewPresenetr(view);
    }

    @Test
    public void testDisplay_1(){
        previewPresneetr.test();
        Mockito.verify(view).display();
    }

    @Test
    public void testDisplay_2(){
        previewPresneetr.test();
        Mockito.verify(view).display();
    }
}
