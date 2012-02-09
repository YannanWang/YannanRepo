package core;

public final class PreverseHelp extends common.FunctionNode {

	public static final int i_lst = 0;
	public static final int i_sofar = 1;

	public static final Class<?> childTypes[] = {common.DecoratedNode.class, common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__core_reverseHelp;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PreverseHelp(final Object c_lst, final Object c_sofar) {
		this(new Object[]{c_lst, c_sofar});
	}

	public PreverseHelp(final Object[] args) {
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
		return "core:reverseHelp";
	}

	public static common.ConsCell invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PreverseHelp(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if null(lst) then sofar else reverseHelp(tail(lst), (head(lst) :: sofar))
		 return (common.ConsCell)((((Boolean)core.Pnull.invoke(new Object[]{context.childAsIsLazy(core.PreverseHelp.i_lst)})) ? ((common.ConsCell)context.childAsIs(core.PreverseHelp.i_sofar)) : ((common.ConsCell)core.PreverseHelp.invoke(new Object[]{new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Ptail.invoke(new Object[]{context.childAsIsLazy(core.PreverseHelp.i_lst)})); } }, new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Closure(context) { public final Object eval() { return ((Object)core.Phead.invoke(new Object[]{context.childAsIsLazy(core.PreverseHelp.i_lst)})); } }, context.childAsIsLazy(core.PreverseHelp.i_sofar)})); } }}))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:reverseHelp", t); }
	}
	public static final common.NodeFactory<common.ConsCell> factory = new Factory();

	public static final class Factory extends common.NodeFactory<common.ConsCell> {

		@Override
		public common.ConsCell invoke(final Object[] args) {
			return PreverseHelp.invoke(args);
		}

	};
}
