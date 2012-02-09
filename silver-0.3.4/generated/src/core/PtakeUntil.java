package core;

public final class PtakeUntil extends common.FunctionNode {

	public static final int i_f = 0;
	public static final int i_lst = 1;

	public static final Class<?> childTypes[] = {common.NodeFactory.class, common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__core_takeUntil;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PtakeUntil(final Object c_f, final Object c_lst) {
		this(new Object[]{c_f, c_lst});
	}

	public PtakeUntil(final Object[] args) {
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
		return "core:takeUntil";
	}

	public static common.ConsCell invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PtakeUntil(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if null(lst) || f(head(lst)) then [] else (head(lst) :: takeUntil(f, tail(lst)))
		 return (common.ConsCell)(((((Boolean)core.Pnull.invoke(new Object[]{context.childAsIsLazy(core.PtakeUntil.i_lst)})) || ((Boolean)((common.NodeFactory<Boolean>)context.childAsIs(core.PtakeUntil.i_f)).invoke(new Object[]{new common.Closure(context) { public final Object eval() { return ((Object)core.Phead.invoke(new Object[]{context.childAsIsLazy(core.PtakeUntil.i_lst)})); } }}))) ? ((common.ConsCell)core.Pnil.invoke(new Object[]{})) : ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Closure(context) { public final Object eval() { return ((Object)core.Phead.invoke(new Object[]{context.childAsIsLazy(core.PtakeUntil.i_lst)})); } }, new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.PtakeUntil.invoke(new Object[]{context.childAsIsLazy(core.PtakeUntil.i_f), new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Ptail.invoke(new Object[]{context.childAsIsLazy(core.PtakeUntil.i_lst)})); } }})); } }}))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:takeUntil", t); }
	}
	public static final common.NodeFactory<common.ConsCell> factory = new Factory();

	public static final class Factory extends common.NodeFactory<common.ConsCell> {

		@Override
		public common.ConsCell invoke(final Object[] args) {
			return PtakeUntil.invoke(args);
		}

	};
}
