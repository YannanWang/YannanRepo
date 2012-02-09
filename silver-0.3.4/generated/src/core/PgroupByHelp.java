package core;

public final class PgroupByHelp extends common.FunctionNode {

	public static final int i_eq = 0;
	public static final int i_f = 1;
	public static final int i_l = 2;

	public static final Class<?> childTypes[] = {common.NodeFactory.class, Object.class, common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__core_groupByHelp;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PgroupByHelp(final Object c_eq, final Object c_f, final Object c_l) {
		this(new Object[]{c_eq, c_f, c_l});
	}

	public PgroupByHelp(final Object[] args) {
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
		return "core:groupByHelp";
	}

	public static core.NPair invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PgroupByHelp(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if null(l) || ! eq(f, head(l)) then pair([], l) else pair((head(l) :: recurse.fst), recurse.snd)
		 return (core.NPair)(((((Boolean)core.Pnull.invoke(new Object[]{context.childAsIsLazy(core.PgroupByHelp.i_l)})) || (!((Boolean)((common.NodeFactory<Boolean>)context.childAsIs(core.PgroupByHelp.i_eq)).invoke(new Object[]{context.childAsIsLazy(core.PgroupByHelp.i_f), new common.Closure(context) { public final Object eval() { return ((Object)core.Phead.invoke(new Object[]{context.childAsIsLazy(core.PgroupByHelp.i_l)})); } }})))) ? ((core.NPair)new core.Ppair(new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Pnil.invoke(new Object[]{})); } }, context.childAsIsLazy(core.PgroupByHelp.i_l))) : ((core.NPair)new core.Ppair(new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Closure(context) { public final Object eval() { return ((Object)core.Phead.invoke(new Object[]{context.childAsIsLazy(core.PgroupByHelp.i_l)})); } }, new common.Closure(context) { public final Object eval() { return ((common.ConsCell)context.localDecorated(core.Init.recurse__ON__core_groupByHelp).synthesized(core.Init.core_fst__ON__core_Pair)); } }})); } }, new common.Closure(context) { public final Object eval() { return ((common.ConsCell)context.localDecorated(core.Init.recurse__ON__core_groupByHelp).synthesized(core.Init.core_snd__ON__core_Pair)); } }))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:groupByHelp", t); }
	}
	public static final common.NodeFactory<core.NPair> factory = new Factory();

	public static final class Factory extends common.NodeFactory<core.NPair> {

		@Override
		public core.NPair invoke(final Object[] args) {
			return PgroupByHelp.invoke(args);
		}

	};
}
