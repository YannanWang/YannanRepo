package core;

public final class PremoveAllBy extends common.FunctionNode {

	public static final int i_eq = 0;
	public static final int i_ys = 1;
	public static final int i_xs = 2;

	public static final Class<?> childTypes[] = {common.NodeFactory.class, common.DecoratedNode.class, common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__core_removeAllBy;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PremoveAllBy(final Object c_eq, final Object c_ys, final Object c_xs) {
		this(new Object[]{c_eq, c_ys, c_xs});
	}

	public PremoveAllBy(final Object[] args) {
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
		return "core:removeAllBy";
	}

	public static common.ConsCell invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PremoveAllBy(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if null(ys) then xs else removeAllBy(eq, tail(ys), removeBy(eq, head(ys), xs))
		 return (common.ConsCell)((((Boolean)core.Pnull.invoke(new Object[]{context.childAsIsLazy(core.PremoveAllBy.i_ys)})) ? ((common.ConsCell)context.childAsIs(core.PremoveAllBy.i_xs)) : ((common.ConsCell)core.PremoveAllBy.invoke(new Object[]{context.childAsIsLazy(core.PremoveAllBy.i_eq), new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Ptail.invoke(new Object[]{context.childAsIsLazy(core.PremoveAllBy.i_ys)})); } }, new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.PremoveBy.invoke(new Object[]{context.childAsIsLazy(core.PremoveAllBy.i_eq), new common.Closure(context) { public final Object eval() { return ((Object)core.Phead.invoke(new Object[]{context.childAsIsLazy(core.PremoveAllBy.i_ys)})); } }, context.childAsIsLazy(core.PremoveAllBy.i_xs)})); } }}))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:removeAllBy", t); }
	}
	public static final common.NodeFactory<common.ConsCell> factory = new Factory();

	public static final class Factory extends common.NodeFactory<common.ConsCell> {

		@Override
		public common.ConsCell invoke(final Object[] args) {
			return PremoveAllBy.invoke(args);
		}

	};
}
