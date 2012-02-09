package core;

public final class PmergeBy extends common.FunctionNode {

	public static final int i_lte = 0;
	public static final int i_l1 = 1;
	public static final int i_l2 = 2;

	public static final Class<?> childTypes[] = {common.NodeFactory.class, common.DecoratedNode.class, common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__core_mergeBy;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PmergeBy(final Object c_lte, final Object c_l1, final Object c_l2) {
		this(new Object[]{c_lte, c_l1, c_l2});
	}

	public PmergeBy(final Object[] args) {
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
		return "core:mergeBy";
	}

	public static common.ConsCell invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PmergeBy(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if null(l1) then l2 else if null(l2) then l1 else if lte(head(l1), head(l2)) then (head(l1) :: mergeBy(lte, tail(l1), l2)) else (head(l2) :: mergeBy(lte, l1, tail(l2)))
		 return (common.ConsCell)((((Boolean)core.Pnull.invoke(new Object[]{context.childAsIsLazy(core.PmergeBy.i_l1)})) ? ((common.ConsCell)context.childAsIs(core.PmergeBy.i_l2)) : (((Boolean)core.Pnull.invoke(new Object[]{context.childAsIsLazy(core.PmergeBy.i_l2)})) ? ((common.ConsCell)context.childAsIs(core.PmergeBy.i_l1)) : (((Boolean)((common.NodeFactory<Boolean>)context.childAsIs(core.PmergeBy.i_lte)).invoke(new Object[]{new common.Closure(context) { public final Object eval() { return ((Object)core.Phead.invoke(new Object[]{context.childAsIsLazy(core.PmergeBy.i_l1)})); } }, new common.Closure(context) { public final Object eval() { return ((Object)core.Phead.invoke(new Object[]{context.childAsIsLazy(core.PmergeBy.i_l2)})); } }})) ? ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Closure(context) { public final Object eval() { return ((Object)core.Phead.invoke(new Object[]{context.childAsIsLazy(core.PmergeBy.i_l1)})); } }, new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.PmergeBy.invoke(new Object[]{context.childAsIsLazy(core.PmergeBy.i_lte), new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Ptail.invoke(new Object[]{context.childAsIsLazy(core.PmergeBy.i_l1)})); } }, context.childAsIsLazy(core.PmergeBy.i_l2)})); } }})) : ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Closure(context) { public final Object eval() { return ((Object)core.Phead.invoke(new Object[]{context.childAsIsLazy(core.PmergeBy.i_l2)})); } }, new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.PmergeBy.invoke(new Object[]{context.childAsIsLazy(core.PmergeBy.i_lte), context.childAsIsLazy(core.PmergeBy.i_l1), new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Ptail.invoke(new Object[]{context.childAsIsLazy(core.PmergeBy.i_l2)})); } }})); } }}))))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:mergeBy", t); }
	}
	public static final common.NodeFactory<common.ConsCell> factory = new Factory();

	public static final class Factory extends common.NodeFactory<common.ConsCell> {

		@Override
		public common.ConsCell invoke(final Object[] args) {
			return PmergeBy.invoke(args);
		}

	};
}
