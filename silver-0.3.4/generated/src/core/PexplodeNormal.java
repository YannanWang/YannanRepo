package core;

public final class PexplodeNormal extends common.FunctionNode {

	public static final int i_sep = 0;
	public static final int i_str = 1;

	public static final Class<?> childTypes[] = {common.StringCatter.class, common.StringCatter.class};

	public static final int num_local_attrs = Init.count_local__ON__core_explodeNormal;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PexplodeNormal(final Object c_sep, final Object c_str) {
		this(new Object[]{c_sep, c_str});
	}

	public PexplodeNormal(final Object[] args) {
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
		return "core:explodeNormal";
	}

	public static common.ConsCell invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PexplodeNormal(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if i == - 1 then [ str ] else (substring(0, i, str) :: explodeNormal(sep, substring(i + length(sep), length(str), str)))
		 return (common.ConsCell)((((Integer)context.localAsIs(core.Init.i__ON__core_explodeNormal)).equals(Integer.valueOf(-Integer.valueOf((int)1))) ? ((common.ConsCell)core.Pcons.invoke(new Object[]{context.childAsIsLazy(core.PexplodeNormal.i_str), new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }})) : ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Closure(context) { public final Object eval() { return ((common.StringCatter)core.Psubstring.invoke(new Object[]{Integer.valueOf((int)0), context.localAsIsLazy(core.Init.i__ON__core_explodeNormal), context.childAsIsLazy(core.PexplodeNormal.i_str)})); } }, new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.PexplodeNormal.invoke(new Object[]{context.childAsIsLazy(core.PexplodeNormal.i_sep), new common.Closure(context) { public final Object eval() { return ((common.StringCatter)core.Psubstring.invoke(new Object[]{new common.Closure(context) { public final Object eval() { return Integer.valueOf(((Integer)context.localAsIs(core.Init.i__ON__core_explodeNormal)) + Integer.valueOf(((common.StringCatter)((common.StringCatter)context.childAsIs(core.PexplodeNormal.i_sep))).length())); } }, new common.Closure(context) { public final Object eval() { return Integer.valueOf(((common.StringCatter)((common.StringCatter)context.childAsIs(core.PexplodeNormal.i_str))).length()); } }, context.childAsIsLazy(core.PexplodeNormal.i_str)})); } }})); } }}))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:explodeNormal", t); }
	}
	public static final common.NodeFactory<common.ConsCell> factory = new Factory();

	public static final class Factory extends common.NodeFactory<common.ConsCell> {

		@Override
		public common.ConsCell invoke(final Object[] args) {
			return PexplodeNormal.invoke(args);
		}

	};
}
