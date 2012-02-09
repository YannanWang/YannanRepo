package core;

public final class PhackUnparse extends common.FunctionNode {

	public static final int i_nt = 0;

	public static final Class<?> childTypes[] = {Object.class};

	public static final int num_local_attrs = Init.count_local__ON__core_hackUnparse;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PhackUnparse(final Object c_nt) {
		this(new Object[]{c_nt});
	}

	public PhackUnparse(final Object[] args) {
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
		return "core:hackUnparse";
	}

	public static common.StringCatter invoke(final Object[] args) {
		try {
		return (common.StringCatter)(common.Util.hackyhackyUnparse(((Object)(args[i_nt] = common.Util.demand(args[i_nt])))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:hackUnparse", t); }
	}
	public static final common.NodeFactory<common.StringCatter> factory = new Factory();

	public static final class Factory extends common.NodeFactory<common.StringCatter> {

		@Override
		public common.StringCatter invoke(final Object[] args) {
			return PhackUnparse.invoke(args);
		}

	};
}
