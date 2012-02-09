package core;

public final class Pintersperse extends common.FunctionNode {

	public static final int i_sep = 0;
	public static final int i_xs = 1;

	public static final Class<?> childTypes[] = {Object.class, common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__core_intersperse;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public Pintersperse(final Object c_sep, final Object c_xs) {
		this(new Object[]{c_sep, c_xs});
	}

	public Pintersperse(final Object[] args) {
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
		return "core:intersperse";
	}

	public static common.ConsCell invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new Pintersperse(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if null(xs) then [] else if null(tail(xs)) then xs else (head(xs) :: (sep :: intersperse(sep, tail(xs))))
		 return (common.ConsCell)((((Boolean)core.Pnull.invoke(new Object[]{context.childAsIsLazy(core.Pintersperse.i_xs)})) ? ((common.ConsCell)core.Pnil.invoke(new Object[]{})) : (((Boolean)core.Pnull.invoke(new Object[]{new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Ptail.invoke(new Object[]{context.childAsIsLazy(core.Pintersperse.i_xs)})); } }})) ? ((common.ConsCell)context.childAsIs(core.Pintersperse.i_xs)) : ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Closure(context) { public final Object eval() { return ((Object)core.Phead.invoke(new Object[]{context.childAsIsLazy(core.Pintersperse.i_xs)})); } }, new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{context.childAsIsLazy(core.Pintersperse.i_sep), new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Pintersperse.invoke(new Object[]{context.childAsIsLazy(core.Pintersperse.i_sep), new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Ptail.invoke(new Object[]{context.childAsIsLazy(core.Pintersperse.i_xs)})); } }})); } }})); } }})))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:intersperse", t); }
	}
	public static final common.NodeFactory<common.ConsCell> factory = new Factory();

	public static final class Factory extends common.NodeFactory<common.ConsCell> {

		@Override
		public common.ConsCell invoke(final Object[] args) {
			return Pintersperse.invoke(args);
		}

	};
}
