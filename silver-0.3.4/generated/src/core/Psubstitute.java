package core;

public final class Psubstitute extends common.FunctionNode {

	public static final int i_search = 0;
	public static final int i_replace = 1;
	public static final int i_str = 2;

	public static final Class<?> childTypes[] = {common.StringCatter.class, common.StringCatter.class, common.StringCatter.class};

	public static final int num_local_attrs = Init.count_local__ON__core_substitute;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public Psubstitute(final Object c_search, final Object c_replace, final Object c_str) {
		this(new Object[]{c_search, c_replace, c_str});
	}

	public Psubstitute(final Object[] args) {
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
		return "core:substitute";
	}

	public static common.StringCatter invoke(final Object[] args) {
		try {
		return (common.StringCatter)new common.StringCatter(((common.StringCatter)(args[i_str] = common.Util.demand(args[i_str]))).toString().replace((CharSequence)((common.StringCatter)(args[i_search] = common.Util.demand(args[i_search]))).toString(),(CharSequence)((common.StringCatter)(args[i_replace] = common.Util.demand(args[i_replace]))).toString()));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:substitute", t); }
	}
	public static final common.NodeFactory<common.StringCatter> factory = new Factory();

	public static final class Factory extends common.NodeFactory<common.StringCatter> {

		@Override
		public common.StringCatter invoke(final Object[] args) {
			return Psubstitute.invoke(args);
		}

	};
}
