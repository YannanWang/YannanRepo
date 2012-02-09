package core;

public final class Pexplode extends common.FunctionNode {

	public static final int i_sep = 0;
	public static final int i_str = 1;

	public static final Class<?> childTypes[] = {common.StringCatter.class, common.StringCatter.class};

	public static final int num_local_attrs = Init.count_local__ON__core_explode;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public Pexplode(final Object c_sep, final Object c_str) {
		this(new Object[]{c_sep, c_str});
	}

	public Pexplode(final Object[] args) {
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
		return "core:explode";
	}

	public static common.ConsCell invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new Pexplode(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if sep == "" then explodeSingle(str) else if str == "" then [] else explodeNormal(sep, str)
		 return (common.ConsCell)((((common.StringCatter)context.childAsIs(core.Pexplode.i_sep)).equals((new common.StringCatter(""))) ? ((common.ConsCell)core.PexplodeSingle.invoke(new Object[]{context.childAsIsLazy(core.Pexplode.i_str)})) : (((common.StringCatter)context.childAsIs(core.Pexplode.i_str)).equals((new common.StringCatter(""))) ? ((common.ConsCell)core.Pnil.invoke(new Object[]{})) : ((common.ConsCell)core.PexplodeNormal.invoke(new Object[]{context.childAsIsLazy(core.Pexplode.i_sep), context.childAsIsLazy(core.Pexplode.i_str)})))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:explode", t); }
	}
	public static final common.NodeFactory<common.ConsCell> factory = new Factory();

	public static final class Factory extends common.NodeFactory<common.ConsCell> {

		@Override
		public common.ConsCell invoke(final Object[] args) {
			return Pexplode.invoke(args);
		}

	};
}
