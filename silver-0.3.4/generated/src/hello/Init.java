package hello;

public class Init{

	private static boolean preInit = false;
	private static boolean init = false;
	private static boolean postInit = false;

	public static void initAllStatics(){
		if(hello.Init.preInit) return;

		hello.Init.preInit = true;

		core.Init.initAllStatics();

	}

	public static void init(){
		if(hello.Init.init) return;

		hello.Init.setupInheritedAttributes();

		hello.Init.init = true;

		core.Init.init();

		hello.Init.initProductionAttributeDefinitions();
	}

	public static void postInit(){
		if(hello.Init.postInit) return;

		hello.Init.postInit = true;

		core.Init.postInit();


	}

	private static void setupInheritedAttributes(){
	}

	private static void initProductionAttributeDefinitions(){
		//FUNCTION main IOVal<Integer> ::= largs::Decorated core:List<String> ioin::IO 
		//FUNCTION expt Integer ::= a::Integer b::Integer 
	}

	public static int count_local__ON__hello_main = 0;
	public static int count_local__ON__hello_expt = 0;
}
