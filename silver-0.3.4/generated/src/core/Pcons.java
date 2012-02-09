package core;

public final class Pcons extends common.FunctionNode {

	public static final int i_h = 0;
	public static final int i_t = 1;

	public static final Class<?> childTypes[] = {Object.class, common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__core_cons;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public Pcons(final Object c_h, final Object c_t) {
		this(new Object[]{c_h, c_t});
	}

	public Pcons(final Object[] args) {
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
		return "core:cons";
	}

	public static common.ConsCell invoke(final Object[] args) {
		try {
		return (common.ConsCell)new common.ConsCell(args[i_h], args[i_t]);
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:cons", t); }
	}
	public static final common.NodeFactory<common.ConsCell> factory = new Factory();

	public static final class Factory extends common.NodeFactory<common.ConsCell> {

		@Override
		public common.ConsCell invoke(final Object[] args) {
			return Pcons.invoke(args);
		}

	};
}
