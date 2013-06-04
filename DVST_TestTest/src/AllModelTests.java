import com.dhbw.dvst.unit.activities.StartActivityTest;
import com.dhbw.dvst.unit.model.FarbeTest;
import com.dhbw.dvst.unit.model.FormTest;
import com.dhbw.dvst.unit.model.SpielerTest;

import junit.framework.*;

public class AllModelTests {

	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(SpielerTest.class);
		suite.addTestSuite(FarbeTest.class);
		suite.addTestSuite(FormTest.class);
		suite.addTestSuite(StartActivityTest.class);
		return suite;
	}
}
