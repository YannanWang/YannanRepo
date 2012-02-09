package hello;

public final class Pexpt extends common.FunctionNode {

	public static final int i_a = 0;
	public static final int i_b = 1;

	public static final Class<?> childTypes[] = {Integer.class, Integer.class};

	public static final int num_local_attrs = Init.count_local__ON__hello_expt;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public Pexpt(final Object c_a, final Object c_b) {
		this(new Object[]{c_a, c_b});
	}

	public Pexpt(final Object[] args) {
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
		return "hello:expt";
	}

	public static Integer invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new Pexpt(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if b == 0 then 1 else a * expt(a, b - 1)
		 return (Integer)((((Integer)context.childAsIs(hello.Pexpt.i_b)).equals(Integer.valueOf((int)0)) ? Integer.valueOf((int)1) : Integer.valueOf(((Integer)context.childAsIs(hello.Pexpt.i_a)) * ((Integer)hello.Pexpt.invoke(new Object[]{context.childAsIsLazy(hello.Pexpt.i_a), new common.Closure(context) { public final Object eval() { return Integer.valueOf(((Integer)context.childAsIs(hello.Pexpt.i_b)) - Integer.valueOf((int)1)); } }})))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function hello:expt", t); }
	}
	public static final common.NodeFactory<Integer> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Integer> {

		@Override
		public Integer invoke(final Object[] args) {
			return Pexpt.invoke(args);
		}

	};
}
