package core;

public final class PendsWith extends common.FunctionNode {

	public static final int i_post = 0;
	public static final int i_s = 1;

	public static final Class<?> childTypes[] = {common.StringCatter.class, common.StringCatter.class};

	public static final int num_local_attrs = Init.count_local__ON__core_endsWith;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PendsWith(final Object c_post, final Object c_s) {
		this(new Object[]{c_post, c_s});
	}

	public PendsWith(final Object[] args) {
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
		return "core:endsWith";
	}

	public static Boolean invoke(final Object[] args) {
		try {
		return (Boolean)(new Boolean(((common.StringCatter)(args[i_s] = common.Util.demand(args[i_s]))).toString().endsWith(((common.StringCatter)(args[i_post] = common.Util.demand(args[i_post]))).toString())));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:endsWith", t); }
	}
	public static final common.NodeFactory<Boolean> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Boolean> {

		@Override
		public Boolean invoke(final Object[] args) {
			return PendsWith.invoke(args);
		}

	};
}
