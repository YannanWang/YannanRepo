package core;

public final class Pcwd extends common.FunctionNode {

	public static final int i_i = 0;

	public static final Class<?> childTypes[] = {Object.class};

	public static final int num_local_attrs = Init.count_local__ON__core_cwd;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public Pcwd(final Object c_i) {
		this(new Object[]{c_i});
	}

	public Pcwd(final Object[] args) {
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
		return "core:cwd";
	}

	public static core.NIOVal invoke(final Object[] args) {
		try {
		return (core.NIOVal)new core.Pioval(((Object)(args[i_i] = common.Util.demand(args[i_i]))), common.Util.cwd());
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:cwd", t); }
	}
	public static final common.NodeFactory<core.NIOVal> factory = new Factory();

	public static final class Factory extends common.NodeFactory<core.NIOVal> {

		@Override
		public core.NIOVal invoke(final Object[] args) {
			return Pcwd.invoke(args);
		}

	};
}
