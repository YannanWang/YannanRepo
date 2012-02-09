package core;

public final class Pappend extends common.FunctionNode {

	public static final int i_l1 = 0;
	public static final int i_l2 = 1;

	public static final Class<?> childTypes[] = {common.DecoratedNode.class, common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__core_append;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public Pappend(final Object c_l1, final Object c_l2) {
		this(new Object[]{c_l1, c_l2});
	}

	public Pappend(final Object[] args) {
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
		return "core:append";
	}

	public static common.ConsCell invoke(final Object[] args) {
		try {
		return (common.ConsCell)common.AppendCell.append(((common.ConsCell)(args[i_l1] = common.Util.demand(args[i_l1]))), args[i_l2]);
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:append", t); }
	}
	public static final common.NodeFactory<common.ConsCell> factory = new Factory();

	public static final class Factory extends common.NodeFactory<common.ConsCell> {

		@Override
		public common.ConsCell invoke(final Object[] args) {
			return Pappend.invoke(args);
		}

	};
}
