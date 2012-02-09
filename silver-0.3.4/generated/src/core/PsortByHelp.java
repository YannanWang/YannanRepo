package core;

public final class PsortByHelp extends common.FunctionNode {

	public static final int i_lte = 0;
	public static final int i_lst = 1;
	public static final int i_upTo = 2;

	public static final Class<?> childTypes[] = {common.NodeFactory.class, common.DecoratedNode.class, Integer.class};

	public static final int num_local_attrs = Init.count_local__ON__core_sortByHelp;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PsortByHelp(final Object c_lte, final Object c_lst, final Object c_upTo) {
		this(new Object[]{c_lte, c_lst, c_upTo});
	}

	public PsortByHelp(final Object[] args) {
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
		return "core:sortByHelp";
	}

	public static common.ConsCell invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PsortByHelp(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if upTo == 0 then [] else if upTo == 1 then [ head(lst) ] else mergeBy(lte, front_half, back_half)
		 return (common.ConsCell)((((Integer)context.childAsIs(core.PsortByHelp.i_upTo)).equals(Integer.valueOf((int)0)) ? ((common.ConsCell)core.Pnil.invoke(new Object[]{})) : (((Integer)context.childAsIs(core.PsortByHelp.i_upTo)).equals(Integer.valueOf((int)1)) ? ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Closure(context) { public final Object eval() { return ((Object)core.Phead.invoke(new Object[]{context.childAsIsLazy(core.PsortByHelp.i_lst)})); } }, new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }})) : ((common.ConsCell)core.PmergeBy.invoke(new Object[]{context.childAsIsLazy(core.PsortByHelp.i_lte), context.localAsIsLazy(core.Init.front_half__ON__core_sortByHelp), context.localAsIsLazy(core.Init.back_half__ON__core_sortByHelp)})))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:sortByHelp", t); }
	}
	public static final common.NodeFactory<common.ConsCell> factory = new Factory();

	public static final class Factory extends common.NodeFactory<common.ConsCell> {

		@Override
		public common.ConsCell invoke(final Object[] args) {
			return PsortByHelp.invoke(args);
		}

	};
}
