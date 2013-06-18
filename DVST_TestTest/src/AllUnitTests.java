import com.dhbw.dvst.unit.activities.SpielActivityTest;
import com.dhbw.dvst.unit.activities.StartActivityTest;
import com.dhbw.dvst.unit.model.FarbeTest;
import com.dhbw.dvst.unit.model.FormTest;
import com.dhbw.dvst.unit.model.GeradenTest;
import com.dhbw.dvst.unit.model.KreuzungsTest;
import com.dhbw.dvst.unit.model.KurvenTest;
import com.dhbw.dvst.unit.model.SpielTest;
import com.dhbw.dvst.unit.model.SpielbrettTest;
import com.dhbw.dvst.unit.model.SpielerTest;
import com.dhbw.dvst.unit.utilities.SpielplattenEinschieberTest;
import com.dhbw.dvst.utilities.SpielplattenEinschieber;

import junit.framework.*;

public class AllUnitTests {

	public static Test suite() {
	
		TestSuite suite = new TestSuite();
		
		//Activities
		suite.addTestSuite(StartActivityTest.class);
		
		//Model
		suite.addTestSuite(FarbeTest.class);
		suite.addTestSuite(FormTest.class);
		suite.addTestSuite(GeradenTest.class);
		suite.addTestSuite(KreuzungsTest.class);
		suite.addTestSuite(KurvenTest.class);
		suite.addTestSuite(SpielbrettTest.class);
		suite.addTestSuite(SpielerTest.class);
		suite.addTestSuite(SpielTest.class);

		//Utilities
		suite.addTestSuite(SpielplattenEinschieberTest.class);

		return suite;
	}
}
