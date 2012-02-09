package core;

public final class PorElse extends common.FunctionNode {

	public static final int i_f = 0;
	public static final int i_s = 1;

	public static final Class<?> childTypes[] = {core.NMaybe.class, core.NMaybe.class};

	public static final int num_local_attrs = Init.count_local__ON__core_orElse;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_f] = new common.Lazy[core.NMaybe.num_inh_attrs];
	childInheritedAttributes[i_s] = new common.Lazy[core.NMaybe.num_inh_attrs];
	}

	public PorElse(final Object c_f, final Object c_s) {
		this(new Object[]{c_f, c_s});
	}

	public PorElse(final Object[] args) {
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
		return "core:orElse";
	}

	public static core.NMaybe invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PorElse(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if f.isJust then f else s
		 return (core.NMaybe)((((Boolean)context.childDecorated(core.PorElse.i_f).synthesized(core.Init.core_isJust__ON__core_Maybe)) ? context.childDecorated(core.PorElse.i_f).undecorate() : context.childDecorated(core.PorElse.i_s).undecorate()));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:orElse", t); }
	}
	public static final common.NodeFactory<core.NMaybe> factory = new Factory();

	public static final class Factory extends common.NodeFactory<core.NMaybe> {

		@Override
		public core.NMaybe invoke(final Object[] args) {
			return PorElse.invoke(args);
		}

	};
}
