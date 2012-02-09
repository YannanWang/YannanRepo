package core;

public final class PsortBy extends common.FunctionNode {

	public static final int i_lte = 0;
	public static final int i_lst = 1;

	public static final Class<?> childTypes[] = {common.NodeFactory.class, common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__core_sortBy;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PsortBy(final Object c_lte, final Object c_lst) {
		this(new Object[]{c_lte, c_lst});
	}

	public PsortBy(final Object[] args) {
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
		return "core:sortBy";
	}

	public static common.ConsCell invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PsortBy(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//sortByHelp(lte, lst, length(lst))
		 return (common.ConsCell)(((common.ConsCell)core.PsortByHelp.invoke(new Object[]{context.childAsIsLazy(core.PsortBy.i_lte), context.childAsIsLazy(core.PsortBy.i_lst), new common.Closure(context) { public final Object eval() { return ((Integer)core.PlistLength.invoke(new Object[]{context.childAsIsLazy(core.PsortBy.i_lst)})); } }})));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:sortBy", t); }
	}
	public static final common.NodeFactory<common.ConsCell> factory = new Factory();

	public static final class Factory extends common.NodeFactory<common.ConsCell> {

		@Override
		public common.ConsCell invoke(final Object[] args) {
			return PsortBy.invoke(args);
		}

	};
}
