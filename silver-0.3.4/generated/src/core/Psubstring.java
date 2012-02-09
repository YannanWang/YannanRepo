package core;

public final class Psubstring extends common.FunctionNode {

	public static final int i_start = 0;
	public static final int i_endl = 1;
	public static final int i_str = 2;

	public static final Class<?> childTypes[] = {Integer.class, Integer.class, common.StringCatter.class};

	public static final int num_local_attrs = Init.count_local__ON__core_substring;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public Psubstring(final Object c_start, final Object c_endl, final Object c_str) {
		this(new Object[]{c_start, c_endl, c_str});
	}

	public Psubstring(final Object[] args) {
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
		return "core:substring";
	}

	public static common.StringCatter invoke(final Object[] args) {
		try {
		return (common.StringCatter)(new common.StringCatter(((common.StringCatter)(args[i_str] = common.Util.demand(args[i_str]))).toString().substring(((Integer)(args[i_start] = common.Util.demand(args[i_start]))), ((Integer)(args[i_endl] = common.Util.demand(args[i_endl]))))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:substring", t); }
	}
	public static final common.NodeFactory<common.StringCatter> factory = new Factory();

	public static final class Factory extends common.NodeFactory<common.StringCatter> {

		@Override
		public common.StringCatter invoke(final Object[] args) {
			return Psubstring.invoke(args);
		}

	};
}
