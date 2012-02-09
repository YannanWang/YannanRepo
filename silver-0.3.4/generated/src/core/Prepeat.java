package core;

public final class Prepeat extends common.FunctionNode {

	public static final int i_v = 0;
	public static final int i_times = 1;

	public static final Class<?> childTypes[] = {Object.class, Integer.class};

	public static final int num_local_attrs = Init.count_local__ON__core_repeat;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public Prepeat(final Object c_v, final Object c_times) {
		this(new Object[]{c_v, c_times});
	}

	public Prepeat(final Object[] args) {
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
		return "core:repeat";
	}

	public static common.ConsCell invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new Prepeat(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if times <= 0 then [] else (v :: repeat(v, times - 1))
		 return (common.ConsCell)(((((Integer)context.childAsIs(core.Prepeat.i_times)) <= Integer.valueOf((int)0)) ? ((common.ConsCell)core.Pnil.invoke(new Object[]{})) : ((common.ConsCell)core.Pcons.invoke(new Object[]{context.childAsIsLazy(core.Prepeat.i_v), new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Prepeat.invoke(new Object[]{context.childAsIsLazy(core.Prepeat.i_v), new common.Closure(context) { public final Object eval() { return Integer.valueOf(((Integer)context.childAsIs(core.Prepeat.i_times)) - Integer.valueOf((int)1)); } }})); } }}))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:repeat", t); }
	}
	public static final common.NodeFactory<common.ConsCell> factory = new Factory();

	public static final class Factory extends common.NodeFactory<common.ConsCell> {

		@Override
		public common.ConsCell invoke(final Object[] args) {
			return Prepeat.invoke(args);
		}

	};
}
