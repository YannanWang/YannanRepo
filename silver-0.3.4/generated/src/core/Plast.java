package core;

public final class Plast extends common.FunctionNode {

	public static final int i_lst = 0;

	public static final Class<?> childTypes[] = {common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__core_last;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public Plast(final Object c_lst) {
		this(new Object[]{c_lst});
	}

	public Plast(final Object[] args) {
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
		return "core:last";
	}

	public static Object invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new Plast(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if null(tail(lst)) then head(lst) else last(tail(lst))
		 return (Object)((((Boolean)core.Pnull.invoke(new Object[]{new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Ptail.invoke(new Object[]{context.childAsIsLazy(core.Plast.i_lst)})); } }})) ? ((Object)core.Phead.invoke(new Object[]{context.childAsIsLazy(core.Plast.i_lst)})) : ((Object)core.Plast.invoke(new Object[]{new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Ptail.invoke(new Object[]{context.childAsIsLazy(core.Plast.i_lst)})); } }}))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:last", t); }
	}
	public static final common.NodeFactory<Object> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Object> {

		@Override
		public Object invoke(final Object[] args) {
			return Plast.invoke(args);
		}

	};
}
