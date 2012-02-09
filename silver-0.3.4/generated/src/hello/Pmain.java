package hello;

public final class Pmain extends common.FunctionNode {

	public static final int i_largs = 0;
	public static final int i_ioin = 1;

	public static final Class<?> childTypes[] = {common.DecoratedNode.class, Object.class};

	public static final int num_local_attrs = Init.count_local__ON__hello_main;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public Pmain(final Object c_largs, final Object c_ioin) {
		this(new Object[]{c_largs, c_ioin});
	}

	public Pmain(final Object[] args) {
		super(args);
	}

	@Override
	public common.Lazy[] getLocalInheritedAttributes(final int key) {
		return localInheritedAttributes[key];
	}

	@Override
	public common.Lazy[] getChildInheritedAttributes(final int key) {
		return childInheritedAttributes[key];
	}

	@Override
	public common.Lazy getLocal(final int key) {
		return localAttributes[key];
	}

	@Override
	public final int getNumberOfLocalAttrs() {
		return num_local_attrs;
	}

	@Override
	public final String getNameOfLocalAttr(final int index) {
		return occurs_local[index];
	}

	@Override
	public String getName() {
		return "hello:main";
	}

	public static core.NIOVal invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new Pmain(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//ioval(print(toString(expt(2, 3)) ++ "\n", ioin), 0)
		 return (core.NIOVal)(((core.NIOVal)new core.Pioval(new common.Closure(context) { public final Object eval() { return ((Object)core.Pprint.invoke(new Object[]{new common.Closure(context) { public final Object eval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter(String.valueOf(((Integer)hello.Pexpt.invoke(new Object[]{Integer.valueOf((int)2), Integer.valueOf((int)3)}))))), (common.StringCatter)(new common.StringCatter("\n"))); } }, context.childAsIsLazy(hello.Pmain.i_ioin)})); } }, Integer.valueOf((int)0))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function hello:main", t); }
	}
	public static final common.NodeFactory<core.NIOVal> factory = new Factory();

	public static final class Factory extends common.NodeFactory<core.NIOVal> {

		@Override
		public core.NIOVal invoke(final Object[] args) {
			return Pmain.invoke(args);
		}

	};
}
