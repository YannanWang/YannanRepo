package core;

public final class Ptake extends common.FunctionNode {

	public static final int i_number = 0;
	public static final int i_lst = 1;

	public static final Class<?> childTypes[] = {Integer.class, common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__core_take;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public Ptake(final Object c_number, final Object c_lst) {
		this(new Object[]{c_number, c_lst});
	}

	public Ptake(final Object[] args) {
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
		return "core:take";
	}

	public static common.ConsCell invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new Ptake(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if number <= 0 then [] else (head(lst) :: take(number - 1, tail(lst)))
		 return (common.ConsCell)(((((Integer)context.childAsIs(core.Ptake.i_number)) <= Integer.valueOf((int)0)) ? ((common.ConsCell)core.Pnil.invoke(new Object[]{})) : ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Closure(context) { public final Object eval() { return ((Object)core.Phead.invoke(new Object[]{context.childAsIsLazy(core.Ptake.i_lst)})); } }, new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Ptake.invoke(new Object[]{new common.Closure(context) { public final Object eval() { return Integer.valueOf(((Integer)context.childAsIs(core.Ptake.i_number)) - Integer.valueOf((int)1)); } }, new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Ptail.invoke(new Object[]{context.childAsIsLazy(core.Ptake.i_lst)})); } }})); } }}))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:take", t); }
	}
	public static final common.NodeFactory<common.ConsCell> factory = new Factory();

	public static final class Factory extends common.NodeFactory<common.ConsCell> {

		@Override
		public common.ConsCell invoke(final Object[] args) {
			return Ptake.invoke(args);
		}

	};
}
