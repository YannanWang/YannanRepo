package core;

public final class PpositionOfHelper extends common.FunctionNode {

	public static final int i_eq = 0;
	public static final int i_x = 1;
	public static final int i_xs = 2;
	public static final int i_currentPos = 3;

	public static final Class<?> childTypes[] = {common.NodeFactory.class, Object.class, common.DecoratedNode.class, Integer.class};

	public static final int num_local_attrs = Init.count_local__ON__core_positionOfHelper;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[4][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PpositionOfHelper(final Object c_eq, final Object c_x, final Object c_xs, final Object c_currentPos) {
		this(new Object[]{c_eq, c_x, c_xs, c_currentPos});
	}

	public PpositionOfHelper(final Object[] args) {
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
		return "core:positionOfHelper";
	}

	public static Integer invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PpositionOfHelper(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if null(xs) then - 1 else if eq(x, head(xs)) then currentPos else positionOfHelper(eq, x, tail(xs), currentPos + 1)
		 return (Integer)((((Boolean)core.Pnull.invoke(new Object[]{context.childAsIsLazy(core.PpositionOfHelper.i_xs)})) ? Integer.valueOf(-Integer.valueOf((int)1)) : (((Boolean)((common.NodeFactory<Boolean>)context.childAsIs(core.PpositionOfHelper.i_eq)).invoke(new Object[]{context.childAsIsLazy(core.PpositionOfHelper.i_x), new common.Closure(context) { public final Object eval() { return ((Object)core.Phead.invoke(new Object[]{context.childAsIsLazy(core.PpositionOfHelper.i_xs)})); } }})) ? ((Integer)context.childAsIs(core.PpositionOfHelper.i_currentPos)) : ((Integer)core.PpositionOfHelper.invoke(new Object[]{context.childAsIsLazy(core.PpositionOfHelper.i_eq), context.childAsIsLazy(core.PpositionOfHelper.i_x), new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Ptail.invoke(new Object[]{context.childAsIsLazy(core.PpositionOfHelper.i_xs)})); } }, new common.Closure(context) { public final Object eval() { return Integer.valueOf(((Integer)context.childAsIs(core.PpositionOfHelper.i_currentPos)) + Integer.valueOf((int)1)); } }})))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:positionOfHelper", t); }
	}
	public static final common.NodeFactory<Integer> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Integer> {

		@Override
		public Integer invoke(final Object[] args) {
			return PpositionOfHelper.invoke(args);
		}

	};
}
