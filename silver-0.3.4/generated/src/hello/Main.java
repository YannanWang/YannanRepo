package hello;

public class Main {
	public static void main(String[] args) {
		hello.Init.initAllStatics();
		hello.Init.init();
		hello.Init.postInit();
		try {
			common.Node rv = (common.Node) hello.Pmain.invoke(new Object[]{cvargs(args), null});
			rv.getChild(core.Pioval.i_i); // demand the io token
			System.exit( (Integer)rv.getChild(core.Pioval.i_v) );
		} catch(Throwable t) {
			common.Util.printStackCauses(t);
		}
	}
	public static common.ConsCell cvargs(String [] args){
		common.ConsCell result = common.ConsCell.nil;
		for(int i = args.length - 1; i >= 0; i --) {
			result = new common.ConsCell(new common.StringCatter(args[i]), result);
		}
		return result;
	}
}
