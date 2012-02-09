package core;

public final class PstringEq extends common.FunctionNode {

	public static final int i_s1 = 0;
	public static final int i_s2 = 1;

	public static final Class<?> childTypes[] = {common.StringCatter.class, common.StringCatter.class};

	public static final int num_local_attrs = Init.count_local__ON__core_stringEq;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PstringEq(final Object c_s1, final Object c_s2) {
		this(new Object[]{c_s1, c_s2});
	}

	public PstringEq(final Object[] args) {
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
		return "core:stringEq";
	}

	public static Boolean invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PstringEq(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//s1 == s2
		 return (Boolean)(((common.StringCatter)context.childAsIs(core.PstringEq.i_s1)).equals(((common.StringCatter)context.childAsIs(core.PstringEq.i_s2))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:stringEq", t); }
	}
	public static final common.NodeFactory<Boolean> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Boolean> {

		@Override
		public Boolean invoke(final Object[] args) {
			return PstringEq.invoke(args);
		}

	};
}
