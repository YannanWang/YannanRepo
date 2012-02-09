package core;

public final class PparseTreeOrDieWithoutStackTrace extends common.FunctionNode {

	public static final int i_pr = 0;

	public static final Class<?> childTypes[] = {core.NParseResult.class};

	public static final int num_local_attrs = Init.count_local__ON__core_parseTreeOrDieWithoutStackTrace;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_pr] = new common.Lazy[core.NParseResult.num_inh_attrs];
	}

	public PparseTreeOrDieWithoutStackTrace(final Object c_pr) {
		this(new Object[]{c_pr});
	}

	public PparseTreeOrDieWithoutStackTrace(final Object[] args) {
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
		return "core:parseTreeOrDieWithoutStackTrace";
	}

	public static Object invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PparseTreeOrDieWithoutStackTrace(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//unsafeTrace(pr.parseTree, if pr.parseSuccess then unsafeIO() else exit(- 1, print(pr.parseErrors ++ "\n\n", unsafeIO())))
		 return (Object)(((Object)core.PunsafeTrace.invoke(new Object[]{context.childSynthesizedLazy(core.PparseTreeOrDieWithoutStackTrace.i_pr, core.Init.core_parseTree__ON__core_ParseResult), new common.Closure(context) { public final Object eval() { return (((Boolean)context.childDecorated(core.PparseTreeOrDieWithoutStackTrace.i_pr).synthesized(core.Init.core_parseSuccess__ON__core_ParseResult)) ? ((Object)core.PunsafeIO.invoke(new Object[]{})) : ((Object)core.Pexit.invoke(new Object[]{new common.Closure(context) { public final Object eval() { return Integer.valueOf(-Integer.valueOf((int)1)); } }, new common.Closure(context) { public final Object eval() { return ((Object)core.Pprint.invoke(new Object[]{new common.Closure(context) { public final Object eval() { return new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(core.PparseTreeOrDieWithoutStackTrace.i_pr).synthesized(core.Init.core_parseErrors__ON__core_ParseResult)), (common.StringCatter)(new common.StringCatter("\n\n"))); } }, new common.Closure(context) { public final Object eval() { return ((Object)core.PunsafeIO.invoke(new Object[]{})); } }})); } }}))); } }})));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:parseTreeOrDieWithoutStackTrace", t); }
	}
	public static final common.NodeFactory<Object> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Object> {

		@Override
		public Object invoke(final Object[] args) {
			return PparseTreeOrDieWithoutStackTrace.invoke(args);
		}

	};
}
