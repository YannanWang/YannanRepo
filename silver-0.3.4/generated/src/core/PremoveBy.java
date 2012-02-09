package core;

public final class PremoveBy extends common.FunctionNode {

	public static final int i_eq = 0;
	public static final int i_x = 1;
	public static final int i_xs = 2;

	public static final Class<?> childTypes[] = {common.NodeFactory.class, Object.class, common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__core_removeBy;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PremoveBy(final Object c_eq, final Object c_x, final Object c_xs) {
		this(new Object[]{c_eq, c_x, c_xs});
	}

	public PremoveBy(final Object[] args) {
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
		return "core:removeBy";
	}

	public static common.ConsCell invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PremoveBy(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if null(xs) then [] else (if eq(x, head(xs)) then [] else [ head(xs) ]) ++ removeBy(eq, x, tail(xs))
		 return (common.ConsCell)((((Boolean)core.Pnull.invoke(new Object[]{context.childAsIsLazy(core.PremoveBy.i_xs)})) ? ((common.ConsCell)core.Pnil.invoke(new Object[]{})) : ((common.ConsCell)core.Pappend.invoke(new Object[]{new common.Closure(context) { public final Object eval() { return (((Boolean)((common.NodeFactory<Boolean>)context.childAsIs(core.PremoveBy.i_eq)).invoke(new Object[]{context.childAsIsLazy(core.PremoveBy.i_x), new common.Closure(context) { public final Object eval() { return ((Object)core.Phead.invoke(new Object[]{context.childAsIsLazy(core.PremoveBy.i_xs)})); } }})) ? ((common.ConsCell)core.Pnil.invoke(new Object[]{})) : ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Closure(context) { public final Object eval() { return ((Object)core.Phead.invoke(new Object[]{context.childAsIsLazy(core.PremoveBy.i_xs)})); } }, new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }}))); } }, new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.PremoveBy.invoke(new Object[]{context.childAsIsLazy(core.PremoveBy.i_eq), context.childAsIsLazy(core.PremoveBy.i_x), new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Ptail.invoke(new Object[]{context.childAsIsLazy(core.PremoveBy.i_xs)})); } }})); } }}))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:removeBy", t); }
	}
	public static final common.NodeFactory<common.ConsCell> factory = new Factory();

	public static final class Factory extends common.NodeFactory<common.ConsCell> {

		@Override
		public common.ConsCell invoke(final Object[] args) {
			return PremoveBy.invoke(args);
		}

	};
}
