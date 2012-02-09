package core;

// top::Maybe<a> ::= v::a 
public final class Pjust extends core.NMaybe {

	public static final int i_v = 0;

	public static final Class<?> childTypes[] = {Object.class};

	public static final int num_local_attrs = Init.count_local__ON__core_just;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[core.NMaybe.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[core.NMaybe.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public Pjust(final Object c_v) {
		this(new Object[]{c_v});
	}

	public Pjust(final Object[] args) {
		super(args);
	}

	@Override
	public common.Lazy getSynthesized(final int index) {
		return synthesizedAttributes[index];
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
	public common.Node getForward(final common.DecoratedNode context) {
		return null;
	}

	@Override
	public common.Lazy getForwardInheritedAttributes(final int index) {
		return forwardInheritedAttributes[index];
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
		return "core:just";
	}

	static void initProductionAttributeDefinitions() {
		// top.fromJust = v
		core.Pjust.synthesizedAttributes[core.Init.core_fromJust__ON__core_Maybe] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Object)context.childAsIs(core.Pjust.i_v)); } };
		// top.isJust = true
		core.Pjust.synthesizedAttributes[core.Init.core_isJust__ON__core_Maybe] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return true; } };
	}

	public static final common.NodeFactory<Pjust> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Pjust> {

		@Override
		public Pjust invoke(final Object[] children) {
			return new Pjust(children);
		}

	};
}
