import java.nio.ByteBuffer;
import java.util.List;

public abstract class ADynamicContainer extends AStructure implements IDynamicContainer{

@Override
public void process() {
	System.out.println("(this instanceof IDynamicContainer");
	subStructureList = getSubStructureList();
	System.out.println("!!!!!!!!!!!!!!!!!BEFORE DYN PRE RUN");
	super.process();
	System.out.println("!!!!!!!!!!!!!!!!!AFTER DYN PRE RUN");
	subStructureList = getSubStructureList();
	lenght = 0;
	binDataBlock.getBody().position(0);
	binDataBlock.getBody().limit(binDataBlock.getBody().capacity());
	System.out.println("!!!!!!!!!!!!!!!!!BEFORE DYN MAIN RUN");
	super.process();
	System.out.println("!!!!!!!!!!!!!!!!!AFTERRF DYN MAIN RUN");
}

}
