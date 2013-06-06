import com.dhbw.dvst.unit.activities.StartActivityTest;
import com.dhbw.dvst.unit.model.FarbeTest;
import com.dhbw.dvst.unit.model.FormTest;
import com.dhbw.dvst.unit.model.GeradenTest;
import com.dhbw.dvst.unit.model.KreuzungsTest;
import com.dhbw.dvst.unit.model.KurvenTest;
import com.dhbw.dvst.unit.model.SpielbrettTest;
import com.dhbw.dvst.unit.model.SpielerTest;
import junit.framework.*;

public class AllModelTests {

	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(SpielerTest.class);
		suite.addTestSuite(FarbeTest.class);
		suite.addTestSuite(FormTest.class);
		suite.addTestSuite(GeradenTest.class);
		suite.addTestSuite(KreuzungsTest.class);
		suite.addTestSuite(KurvenTest.class);
		suite.addTestSuite(SpielbrettTest.class);
		
		suite.addTestSuite(StartActivityTest.class);
		return suite;
	}
}
