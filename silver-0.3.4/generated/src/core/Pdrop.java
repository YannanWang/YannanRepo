package core;

public final class Pdrop extends common.FunctionNode {

	public static final int i_number = 0;
	public static final int i_lst = 1;

	public static final Class<?> childTypes[] = {Integer.class, common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__core_drop;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public Pdrop(final Object c_number, final Object c_lst) {
		this(new Object[]{c_number, c_lst});
	}

	public Pdrop(final Object[] args) {
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
		return "core:drop";
	}

	public static common.ConsCell invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new Pdrop(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if number <= 0 then lst else drop(number - 1, tail(lst))
		 return (common.ConsCell)(((((Integer)context.childAsIs(core.Pdrop.i_number)) <= Integer.valueOf((int)0)) ? ((common.ConsCell)context.childAsIs(core.Pdrop.i_lst)) : ((common.ConsCell)core.Pdrop.invoke(new Object[]{new common.Closure(context) { public final Object eval() { return Integer.valueOf(((Integer)context.childAsIs(core.Pdrop.i_number)) - Integer.valueOf((int)1)); } }, new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Ptail.invoke(new Object[]{context.childAsIsLazy(core.Pdrop.i_lst)})); } }}))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:drop", t); }
	}
	public static final common.NodeFactory<common.ConsCell> factory = new Factory();

	public static final class Factory extends common.NodeFactory<common.ConsCell> {

		@Override
		public common.ConsCell invoke(final Object[] args) {
			return Pdrop.invoke(args);
		}

	};
}
