package core;

public final class PlastIndexOf extends common.FunctionNode {

	public static final int i_needle = 0;
	public static final int i_haystack = 1;

	public static final Class<?> childTypes[] = {common.StringCatter.class, common.StringCatter.class};

	public static final int num_local_attrs = Init.count_local__ON__core_lastIndexOf;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PlastIndexOf(final Object c_needle, final Object c_haystack) {
		this(new Object[]{c_needle, c_haystack});
	}

	public PlastIndexOf(final Object[] args) {
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
		return "core:lastIndexOf";
	}

	public static Integer invoke(final Object[] args) {
		try {
		return (Integer)(new Integer((((common.StringCatter)(args[i_haystack] = common.Util.demand(args[i_haystack]))).toString().lastIndexOf(((common.StringCatter)(args[i_needle] = common.Util.demand(args[i_needle]))).toString()))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:lastIndexOf", t); }
	}
	public static final common.NodeFactory<Integer> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Integer> {

		@Override
		public Integer invoke(final Object[] args) {
			return PlastIndexOf.invoke(args);
		}

	};
}
