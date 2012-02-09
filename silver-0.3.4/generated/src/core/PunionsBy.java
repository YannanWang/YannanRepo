package core;

public final class PunionsBy extends common.FunctionNode {

	public static final int i_eq = 0;
	public static final int i_ss = 1;

	public static final Class<?> childTypes[] = {common.NodeFactory.class, common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__core_unionsBy;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PunionsBy(final Object c_eq, final Object c_ss) {
		this(new Object[]{c_eq, c_ss});
	}

	public PunionsBy(final Object[] args) {
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
		return "core:unionsBy";
	}

	public static common.ConsCell invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PunionsBy(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//nubBy(eq, foldr(append, [], ss))
		 return (common.ConsCell)(((common.ConsCell)core.PnubBy.invoke(new Object[]{context.childAsIsLazy(core.PunionsBy.i_eq), new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Pfoldr.invoke(new Object[]{core.Pappend.factory, new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }, context.childAsIsLazy(core.PunionsBy.i_ss)})); } }})));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:unionsBy", t); }
	}
	public static final common.NodeFactory<common.ConsCell> factory = new Factory();

	public static final class Factory extends common.NodeFactory<common.ConsCell> {

		@Override
		public common.ConsCell invoke(final Object[] args) {
			return PunionsBy.invoke(args);
		}

	};
}
