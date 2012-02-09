package core;

public final class PintersectBy extends common.FunctionNode {

	public static final int i_eq = 0;
	public static final int i_l = 1;
	public static final int i_r = 2;

	public static final Class<?> childTypes[] = {common.NodeFactory.class, common.DecoratedNode.class, common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__core_intersectBy;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PintersectBy(final Object c_eq, final Object c_l, final Object c_r) {
		this(new Object[]{c_eq, c_l, c_r});
	}

	public PintersectBy(final Object[] args) {
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
		return "core:intersectBy";
	}

	public static common.ConsCell invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PintersectBy(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if null(l) then [] else (if containsBy(eq, head(l), r) then [ head(l) ] else []) ++ intersectBy(eq, tail(l), r)
		 return (common.ConsCell)((((Boolean)core.Pnull.invoke(new Object[]{context.childAsIsLazy(core.PintersectBy.i_l)})) ? ((common.ConsCell)core.Pnil.invoke(new Object[]{})) : ((common.ConsCell)core.Pappend.invoke(new Object[]{new common.Closure(context) { public final Object eval() { return (((Boolean)core.PcontainsBy.invoke(new Object[]{context.childAsIsLazy(core.PintersectBy.i_eq), new common.Closure(context) { public final Object eval() { return ((Object)core.Phead.invoke(new Object[]{context.childAsIsLazy(core.PintersectBy.i_l)})); } }, context.childAsIsLazy(core.PintersectBy.i_r)})) ? ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Closure(context) { public final Object eval() { return ((Object)core.Phead.invoke(new Object[]{context.childAsIsLazy(core.PintersectBy.i_l)})); } }, new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }})) : ((common.ConsCell)core.Pnil.invoke(new Object[]{}))); } }, new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.PintersectBy.invoke(new Object[]{context.childAsIsLazy(core.PintersectBy.i_eq), new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Ptail.invoke(new Object[]{context.childAsIsLazy(core.PintersectBy.i_l)})); } }, context.childAsIsLazy(core.PintersectBy.i_r)})); } }}))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:intersectBy", t); }
	}
	public static final common.NodeFactory<common.ConsCell> factory = new Factory();

	public static final class Factory extends common.NodeFactory<common.ConsCell> {

		@Override
		public common.ConsCell invoke(final Object[] args) {
			return PintersectBy.invoke(args);
		}

	};
}
