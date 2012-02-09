package core;

public final class PexplodeSingle extends common.FunctionNode {

	public static final int i_str = 0;

	public static final Class<?> childTypes[] = {common.StringCatter.class};

	public static final int num_local_attrs = Init.count_local__ON__core_explodeSingle;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PexplodeSingle(final Object c_str) {
		this(new Object[]{c_str});
	}

	public PexplodeSingle(final Object[] args) {
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
		return "core:explodeSingle";
	}

	public static common.ConsCell invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PexplodeSingle(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if length(str) == 0 then [] else (substring(0, 1, str) :: explodeSingle(substring(1, length(str), str)))
		 return (common.ConsCell)((Integer.valueOf(((common.StringCatter)((common.StringCatter)context.childAsIs(core.PexplodeSingle.i_str))).length()).equals(Integer.valueOf((int)0)) ? ((common.ConsCell)core.Pnil.invoke(new Object[]{})) : ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Closure(context) { public final Object eval() { return ((common.StringCatter)core.Psubstring.invoke(new Object[]{Integer.valueOf((int)0), Integer.valueOf((int)1), context.childAsIsLazy(core.PexplodeSingle.i_str)})); } }, new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.PexplodeSingle.invoke(new Object[]{new common.Closure(context) { public final Object eval() { return ((common.StringCatter)core.Psubstring.invoke(new Object[]{Integer.valueOf((int)1), new common.Closure(context) { public final Object eval() { return Integer.valueOf(((common.StringCatter)((common.StringCatter)context.childAsIs(core.PexplodeSingle.i_str))).length()); } }, context.childAsIsLazy(core.PexplodeSingle.i_str)})); } }})); } }}))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:explodeSingle", t); }
	}
	public static final common.NodeFactory<common.ConsCell> factory = new Factory();

	public static final class Factory extends common.NodeFactory<common.ConsCell> {

		@Override
		public common.ConsCell invoke(final Object[] args) {
			return PexplodeSingle.invoke(args);
		}

	};
}
