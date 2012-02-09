package core;

public final class PcontainsBy extends common.FunctionNode {

	public static final int i_eq = 0;
	public static final int i_elem = 1;
	public static final int i_lst = 2;

	public static final Class<?> childTypes[] = {common.NodeFactory.class, Object.class, common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__core_containsBy;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PcontainsBy(final Object c_eq, final Object c_elem, final Object c_lst) {
		this(new Object[]{c_eq, c_elem, c_lst});
	}

	public PcontainsBy(final Object[] args) {
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
		return "core:containsBy";
	}

	public static Boolean invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PcontainsBy(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//(! null(lst)) && (eq(elem, head(lst)) || containsBy(eq, elem, tail(lst)))
		 return (Boolean)(((!((Boolean)core.Pnull.invoke(new Object[]{context.childAsIsLazy(core.PcontainsBy.i_lst)}))) && (((Boolean)((common.NodeFactory<Boolean>)context.childAsIs(core.PcontainsBy.i_eq)).invoke(new Object[]{context.childAsIsLazy(core.PcontainsBy.i_elem), new common.Closure(context) { public final Object eval() { return ((Object)core.Phead.invoke(new Object[]{context.childAsIsLazy(core.PcontainsBy.i_lst)})); } }})) || ((Boolean)core.PcontainsBy.invoke(new Object[]{context.childAsIsLazy(core.PcontainsBy.i_eq), context.childAsIsLazy(core.PcontainsBy.i_elem), new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Ptail.invoke(new Object[]{context.childAsIsLazy(core.PcontainsBy.i_lst)})); } }})))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:containsBy", t); }
	}
	public static final common.NodeFactory<Boolean> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Boolean> {

		@Override
		public Boolean invoke(final Object[] args) {
			return PcontainsBy.invoke(args);
		}

	};
}
