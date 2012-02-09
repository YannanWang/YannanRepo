package core;

public class Init{

	private static boolean preInit = false;
	private static boolean init = false;
	private static boolean postInit = false;

	public static void initAllStatics(){
		if(core.Init.preInit) return;

		core.Init.preInit = true;


	}

	public static void init(){
		if(core.Init.init) return;

		core.Init.setupInheritedAttributes();

		core.Init.init = true;


		core.Init.initProductionAttributeDefinitions();
	}

	public static void postInit(){
		if(core.Init.postInit) return;

		core.Init.postInit = true;



		common.Decorator.applyDecorators(core.NPair.decorators, Ppair.class);
		common.Decorator.applyDecorators(core.NIOVal.decorators, Pioval.class);
		common.Decorator.applyDecorators(core.NList.decorators, Pi_nilList.class);
		common.Decorator.applyDecorators(core.NList.decorators, Pi_consList.class);
		common.Decorator.applyDecorators(core.NParseResult.decorators, PparseFailed.class);
		common.Decorator.applyDecorators(core.NParseResult.decorators, PparseSucceeded.class);
		common.Decorator.applyDecorators(core.NMaybe.decorators, Pjust.class);
		common.Decorator.applyDecorators(core.NMaybe.decorators, Pnothing.class);
	}

	private static void setupInheritedAttributes(){
		core.NPair.occurs_syn[core.Init.core_fst__ON__core_Pair] = "core:fst";
		core.NPair.occurs_syn[core.Init.core_snd__ON__core_Pair] = "core:snd";
		core.PexplodeNormal.occurs_local[core.Init.i__ON__core_explodeNormal] = "core:explodeNormal:local:i";
		core.NIOVal.occurs_syn[core.Init.core_io__ON__core_IOVal] = "core:io";
		core.NIOVal.occurs_syn[core.Init.core_iovalue__ON__core_IOVal] = "core:iovalue";
		core.PdirNameInFilePath.occurs_local[core.Init.indexOfLastSlash__ON__core_dirNameInFilePath] = "core:dirNameInFilePath:local:indexOfLastSlash";
		core.PfileNameInFilePath.occurs_local[core.Init.indexOfLastSlash__ON__core_fileNameInFilePath] = "core:fileNameInFilePath:local:indexOfLastSlash";
		core.PsplitFileNameAndExtension.occurs_local[core.Init.indexOfLastDot__ON__core_splitFileNameAndExtension] = "core:splitFileNameAndExtension:local:indexOfLastDot";
		//	local attribute recurse::Pair<Decorated core:List<a> Decorated core:List<a>>;
		core.Ppartition.localInheritedAttributes[core.Init.recurse__ON__core_partition] = new common.Lazy[core.NPair.num_inh_attrs];
		core.Ppartition.occurs_local[core.Init.recurse__ON__core_partition] = "core:partition:local:recurse";
		core.PsortByHelp.occurs_local[core.Init.front_half__ON__core_sortByHelp] = "core:sortByHelp:local:front_half";
		core.PsortByHelp.occurs_local[core.Init.back_half__ON__core_sortByHelp] = "core:sortByHelp:local:back_half";
		core.PsortByHelp.occurs_local[core.Init.middle__ON__core_sortByHelp] = "core:sortByHelp:local:middle";
		//	local attribute helpercall::Pair<Decorated core:List<a> Decorated core:List<a>>;
		core.PgroupBy.localInheritedAttributes[core.Init.helpercall__ON__core_groupBy] = new common.Lazy[core.NPair.num_inh_attrs];
		core.PgroupBy.occurs_local[core.Init.helpercall__ON__core_groupBy] = "core:groupBy:local:helpercall";
		//	local attribute recurse::Pair<Decorated core:List<a> Decorated core:List<a>>;
		core.PgroupByHelp.localInheritedAttributes[core.Init.recurse__ON__core_groupByHelp] = new common.Lazy[core.NPair.num_inh_attrs];
		core.PgroupByHelp.occurs_local[core.Init.recurse__ON__core_groupByHelp] = "core:groupByHelp:local:recurse";
		core.NList.occurs_syn[core.Init.core_i_headList__ON__core_List] = "core:i_headList";
		core.NList.occurs_syn[core.Init.core_i_tailList__ON__core_List] = "core:i_tailList";
		core.NList.occurs_syn[core.Init.core_i_emptyList__ON__core_List] = "core:i_emptyList";
		core.NList.occurs_syn[core.Init.core_i_lengthList__ON__core_List] = "core:i_lengthList";
		core.NParseResult.occurs_syn[core.Init.core_parseSuccess__ON__core_ParseResult] = "core:parseSuccess";
		core.NParseResult.occurs_syn[core.Init.core_parseErrors__ON__core_ParseResult] = "core:parseErrors";
		core.NParseResult.occurs_syn[core.Init.core_parseTree__ON__core_ParseResult] = "core:parseTree";
		core.NMaybe.occurs_syn[core.Init.core_fromJust__ON__core_Maybe] = "core:fromJust";
		core.NMaybe.occurs_syn[core.Init.core_isJust__ON__core_Maybe] = "core:isJust";
	}

	private static void initProductionAttributeDefinitions(){
		core.Ppair.initProductionAttributeDefinitions();
		//FUNCTION lookupBy Maybe<b> ::= eqf::Function(Boolean ::= a a) elem::a lst::Decorated core:List<Pair<a b>> 
		//FUNCTION implode String ::= sep::String lst::Decorated core:List<String> 
		//FUNCTION explode Decorated core:List<String> ::= sep::String str::String 
		//FUNCTION explodeNormal Decorated core:List<String> ::= sep::String str::String 
		// i = indexOf(sep, str)
		core.PexplodeNormal.localAttributes[core.Init.i__ON__core_explodeNormal] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)core.PindexOf.invoke(new Object[]{context.childAsIsLazy(core.PexplodeNormal.i_sep), context.childAsIsLazy(core.PexplodeNormal.i_str)})); } };
		//FUNCTION explodeSingle Decorated core:List<String> ::= str::String 
		//FUNCTION stringEq Boolean ::= s1::String s2::String 
		//FUNCTION stringLte Boolean ::= s1::String s2::String 
		//FUNCTION stringConcat String ::= s1::String s2::String 
		core.Pioval.initProductionAttributeDefinitions();
		//FUNCTION dirNameInFilePath String ::= filePath::String 
		// indexOfLastSlash = lastIndexOf("/", filePath)
		core.PdirNameInFilePath.localAttributes[core.Init.indexOfLastSlash__ON__core_dirNameInFilePath] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)core.PlastIndexOf.invoke(new Object[]{(new common.StringCatter("/")), context.childAsIsLazy(core.PdirNameInFilePath.i_filePath)})); } };
		//FUNCTION fileNameInFilePath String ::= filePath::String 
		// indexOfLastSlash = lastIndexOf("/", filePath)
		core.PfileNameInFilePath.localAttributes[core.Init.indexOfLastSlash__ON__core_fileNameInFilePath] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)core.PlastIndexOf.invoke(new Object[]{(new common.StringCatter("/")), context.childAsIsLazy(core.PfileNameInFilePath.i_filePath)})); } };
		//FUNCTION splitFileNameAndExtension Pair<String String> ::= filePath::String 
		// indexOfLastDot = lastIndexOf(".", filePath)
		core.PsplitFileNameAndExtension.localAttributes[core.Init.indexOfLastDot__ON__core_splitFileNameAndExtension] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)core.PlastIndexOf.invoke(new Object[]{(new common.StringCatter(".")), context.childAsIsLazy(core.PsplitFileNameAndExtension.i_filePath)})); } };
		//FUNCTION map Decorated core:List<b> ::= f::Function(b ::= a) l::Decorated core:List<a> 
		//FUNCTION map_p Decorated core:List<b> ::= f::Production(b ::= a) l::Decorated core:List<a> 
		//FUNCTION foldr b ::= f::Function(b ::= a b) i::b l::Decorated core:List<a> 
		//FUNCTION foldr_p b ::= f::Production(b ::= a b) i::b l::Decorated core:List<a> 
		//FUNCTION foldl a ::= f::Function(a ::= a b) i::a l::Decorated core:List<b> 
		//FUNCTION foldl_p a ::= f::Production(a ::= a b) i::a l::Decorated core:List<b> 
		//FUNCTION foldr1 a ::= f::Function(a ::= a a) l::Decorated core:List<a> 
		//FUNCTION foldr1_p a ::= f::Production(a ::= a a) l::Decorated core:List<a> 
		//FUNCTION foldl1 a ::= f::Function(a ::= a a) l::Decorated core:List<a> 
		//FUNCTION foldl1_p a ::= f::Production(a ::= a a) l::Decorated core:List<a> 
		//FUNCTION filter Decorated core:List<a> ::= f::Function(Boolean ::= a) lst::Decorated core:List<a> 
		//FUNCTION partition Pair<Decorated core:List<a> Decorated core:List<a>> ::= f::Function(Boolean ::= a) lst::Decorated core:List<a> 
		// recurse = partition(f, tail(lst))
		core.Ppartition.localAttributes[core.Init.recurse__ON__core_partition] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((core.NPair)core.Ppartition.invoke(new Object[]{context.childAsIsLazy(core.Ppartition.i_f), new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Ptail.invoke(new Object[]{context.childAsIsLazy(core.Ppartition.i_lst)})); } }})); } };
		//FUNCTION containsBy Boolean ::= eq::Function(Boolean ::= a a) elem::a lst::Decorated core:List<a> 
		//FUNCTION nubBy Decorated core:List<a> ::= eq::Function(Boolean ::= a a) xs::Decorated core:List<a> 
		//FUNCTION removeBy Decorated core:List<a> ::= eq::Function(Boolean ::= a a) x::a xs::Decorated core:List<a> 
		//FUNCTION removeAllBy Decorated core:List<a> ::= eq::Function(Boolean ::= a a) ys::Decorated core:List<a> xs::Decorated core:List<a> 
		//FUNCTION last a ::= lst::Decorated core:List<a> 
		//FUNCTION drop Decorated core:List<a> ::= number::Integer lst::Decorated core:List<a> 
		//FUNCTION take Decorated core:List<a> ::= number::Integer lst::Decorated core:List<a> 
		//FUNCTION dropWhile Decorated core:List<a> ::= f::Function(Boolean ::= a) lst::Decorated core:List<a> 
		//FUNCTION takeWhile Decorated core:List<a> ::= f::Function(Boolean ::= a) lst::Decorated core:List<a> 
		//FUNCTION takeUntil Decorated core:List<a> ::= f::Function(Boolean ::= a) lst::Decorated core:List<a> 
		//FUNCTION positionOf Integer ::= eq::Function(Boolean ::= a a) x::a xs::Decorated core:List<a> 
		//FUNCTION positionOfHelper Integer ::= eq::Function(Boolean ::= a a) x::a xs::Decorated core:List<a> currentPos::Integer 
		//FUNCTION repeat Decorated core:List<a> ::= v::a times::Integer 
		//FUNCTION zipWith Decorated core:List<c> ::= l1::Decorated core:List<a> l2::Decorated core:List<b> f::Function(c ::= a b) 
		//FUNCTION zipWith_p Decorated core:List<c> ::= l1::Decorated core:List<a> l2::Decorated core:List<b> f::Production(c ::= a b) 
		//FUNCTION reverse Decorated core:List<a> ::= lst::Decorated core:List<a> 
		//FUNCTION reverseHelp Decorated core:List<a> ::= lst::Decorated core:List<a> sofar::Decorated core:List<a> 
		//FUNCTION sortBy Decorated core:List<a> ::= lte::Function(Boolean ::= a a) lst::Decorated core:List<a> 
		//FUNCTION sortByHelp Decorated core:List<a> ::= lte::Function(Boolean ::= a a) lst::Decorated core:List<a> upTo::Integer 
		// front_half = sortByHelp(lte, lst, middle)
		core.PsortByHelp.localAttributes[core.Init.front_half__ON__core_sortByHelp] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.PsortByHelp.invoke(new Object[]{context.childAsIsLazy(core.PsortByHelp.i_lte), context.childAsIsLazy(core.PsortByHelp.i_lst), context.localAsIsLazy(core.Init.middle__ON__core_sortByHelp)})); } };
		// back_half = sortByHelp(lte, drop(middle, lst), upTo - middle)
		core.PsortByHelp.localAttributes[core.Init.back_half__ON__core_sortByHelp] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.PsortByHelp.invoke(new Object[]{context.childAsIsLazy(core.PsortByHelp.i_lte), new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Pdrop.invoke(new Object[]{context.localAsIsLazy(core.Init.middle__ON__core_sortByHelp), context.childAsIsLazy(core.PsortByHelp.i_lst)})); } }, new common.Closure(context) { public final Object eval() { return Integer.valueOf(((Integer)context.childAsIs(core.PsortByHelp.i_upTo)) - ((Integer)context.localAsIs(core.Init.middle__ON__core_sortByHelp))); } }})); } };
		// middle = toInt(toFloat(upTo) / 2.0)
		core.PsortByHelp.localAttributes[core.Init.middle__ON__core_sortByHelp] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Float)Float.valueOf(((Integer)((Integer)context.childAsIs(core.PsortByHelp.i_upTo))).floatValue() / Float.valueOf((float)2.0))).intValue(); } };
		//FUNCTION mergeBy Decorated core:List<a> ::= lte::Function(Boolean ::= a a) l1::Decorated core:List<a> l2::Decorated core:List<a> 
		//FUNCTION groupBy Decorated core:List<Decorated core:List<a>> ::= eq::Function(Boolean ::= a a) l::Decorated core:List<a> 
		// helpercall = groupByHelp(eq, head(l), l)
		core.PgroupBy.localAttributes[core.Init.helpercall__ON__core_groupBy] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((core.NPair)core.PgroupByHelp.invoke(new Object[]{context.childAsIsLazy(core.PgroupBy.i_eq), new common.Closure(context) { public final Object eval() { return ((Object)core.Phead.invoke(new Object[]{context.childAsIsLazy(core.PgroupBy.i_l)})); } }, context.childAsIsLazy(core.PgroupBy.i_l)})); } };
		//FUNCTION groupByHelp Pair<Decorated core:List<a> Decorated core:List<a>> ::= eq::Function(Boolean ::= a a) f::a l::Decorated core:List<a> 
		// recurse = groupByHelp(eq, f, tail(l))
		core.PgroupByHelp.localAttributes[core.Init.recurse__ON__core_groupByHelp] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((core.NPair)core.PgroupByHelp.invoke(new Object[]{context.childAsIsLazy(core.PgroupByHelp.i_eq), context.childAsIsLazy(core.PgroupByHelp.i_f), new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Ptail.invoke(new Object[]{context.childAsIsLazy(core.PgroupByHelp.i_l)})); } }})); } };
		//FUNCTION intersperse Decorated core:List<a> ::= sep::a xs::Decorated core:List<a> 
		//FUNCTION unionBy Decorated core:List<a> ::= eq::Function(Boolean ::= a a) l::Decorated core:List<a> r::Decorated core:List<a> 
		//FUNCTION intersectBy Decorated core:List<a> ::= eq::Function(Boolean ::= a a) l::Decorated core:List<a> r::Decorated core:List<a> 
		//FUNCTION unionsBy Decorated core:List<a> ::= eq::Function(Boolean ::= a a) ss::Decorated core:List<Decorated core:List<a>> 
		core.Pi_nilList.initProductionAttributeDefinitions();
		core.Pi_consList.initProductionAttributeDefinitions();
		core.PparseFailed.initProductionAttributeDefinitions();
		core.PparseSucceeded.initProductionAttributeDefinitions();
		//FUNCTION parseTreeOrDieWithoutStackTrace a ::= pr::ParseResult<a> 
		core.Pjust.initProductionAttributeDefinitions();
		core.Pnothing.initProductionAttributeDefinitions();
		//FUNCTION fromMaybe a ::= otherwise::a ifJust::Maybe<a> 
		//FUNCTION orElse Maybe<a> ::= f::Maybe<a> s::Maybe<a> 
	}

	public static int count_inh__ON__Pair = 0;
	public static int count_syn__ON__Pair = 0;
	public static int count_local__ON__core_pair = 0;
	public static int count_local__ON__core_lookupBy = 0;
	public static int count_local__ON__core_implode = 0;
	public static int count_local__ON__core_explode = 0;
	public static int count_local__ON__core_explodeNormal = 0;
	public static int count_local__ON__core_explodeSingle = 0;
	public static int count_local__ON__core_stringEq = 0;
	public static int count_local__ON__core_stringLte = 0;
	public static int count_local__ON__core_indexOf = 0;
	public static int count_local__ON__core_lastIndexOf = 0;
	public static int count_local__ON__core_substring = 0;
	public static int count_local__ON__core_startsWith = 0;
	public static int count_local__ON__core_endsWith = 0;
	public static int count_local__ON__core_substitute = 0;
	public static int count_local__ON__core_replicate = 0;
	public static int count_local__ON__core_isDigit = 0;
	public static int count_local__ON__core_isAlpha = 0;
	public static int count_local__ON__core_isSpace = 0;
	public static int count_local__ON__core_isLower = 0;
	public static int count_local__ON__core_isUpper = 0;
	public static int count_local__ON__core_compareString = 0;
	public static int count_local__ON__core_stringConcat = 0;
	public static int count_inh__ON__IOVal = 0;
	public static int count_syn__ON__IOVal = 0;
	public static int count_local__ON__core_ioval = 0;
	public static int count_local__ON__core_print = 0;
	public static int count_local__ON__core_exit = 0;
	public static int count_local__ON__core_mkdir = 0;
	public static int count_local__ON__core_system = 0;
	public static int count_local__ON__core_writeFile = 0;
	public static int count_local__ON__core_appendFile = 0;
	public static int count_local__ON__core_fileTime = 0;
	public static int count_local__ON__core_isFile = 0;
	public static int count_local__ON__core_isDirectory = 0;
	public static int count_local__ON__core_readFile = 0;
	public static int count_local__ON__core_cwd = 0;
	public static int count_local__ON__core_envVar = 0;
	public static int count_local__ON__core_listContents = 0;
	public static int count_local__ON__core_deleteFile = 0;
	public static int count_local__ON__core_error = 0;
	public static int count_local__ON__core_unsafeIO = 0;
	public static int count_local__ON__core_genInt = 0;
	public static int count_local__ON__core_unsafeTrace = 0;
	public static int count_local__ON__core_dirNameInFilePath = 0;
	public static int count_local__ON__core_fileNameInFilePath = 0;
	public static int count_local__ON__core_splitFileNameAndExtension = 0;
	public static int count_local__ON__core_hackUnparse = 0;
	public static int count_local__ON__core_map = 0;
	public static int count_local__ON__core_map_p = 0;
	public static int count_local__ON__core_foldr = 0;
	public static int count_local__ON__core_foldr_p = 0;
	public static int count_local__ON__core_foldl = 0;
	public static int count_local__ON__core_foldl_p = 0;
	public static int count_local__ON__core_foldr1 = 0;
	public static int count_local__ON__core_foldr1_p = 0;
	public static int count_local__ON__core_foldl1 = 0;
	public static int count_local__ON__core_foldl1_p = 0;
	public static int count_local__ON__core_filter = 0;
	public static int count_local__ON__core_partition = 0;
	public static int count_local__ON__core_containsBy = 0;
	public static int count_local__ON__core_nubBy = 0;
	public static int count_local__ON__core_removeBy = 0;
	public static int count_local__ON__core_removeAllBy = 0;
	public static int count_local__ON__core_last = 0;
	public static int count_local__ON__core_drop = 0;
	public static int count_local__ON__core_take = 0;
	public static int count_local__ON__core_dropWhile = 0;
	public static int count_local__ON__core_takeWhile = 0;
	public static int count_local__ON__core_takeUntil = 0;
	public static int count_local__ON__core_positionOf = 0;
	public static int count_local__ON__core_positionOfHelper = 0;
	public static int count_local__ON__core_repeat = 0;
	public static int count_local__ON__core_zipWith = 0;
	public static int count_local__ON__core_zipWith_p = 0;
	public static int count_local__ON__core_reverse = 0;
	public static int count_local__ON__core_reverseHelp = 0;
	public static int count_local__ON__core_sortBy = 0;
	public static int count_local__ON__core_sortByHelp = 0;
	public static int count_local__ON__core_mergeBy = 0;
	public static int count_local__ON__core_groupBy = 0;
	public static int count_local__ON__core_groupByHelp = 0;
	public static int count_local__ON__core_intersperse = 0;
	public static int count_local__ON__core_unionBy = 0;
	public static int count_local__ON__core_intersectBy = 0;
	public static int count_local__ON__core_unionsBy = 0;
	public static int count_local__ON__core_nil = 0;
	public static int count_local__ON__core_cons = 0;
	public static int count_local__ON__core_append = 0;
	public static int count_local__ON__core_null = 0;
	public static int count_local__ON__core_listLength = 0;
	public static int count_local__ON__core_head = 0;
	public static int count_local__ON__core_tail = 0;
	public static int count_inh__ON__List = 0;
	public static int count_syn__ON__List = 0;
	public static int count_local__ON__core_i_nilList = 0;
	public static int count_local__ON__core_i_consList = 0;
	public static int count_inh__ON__ParseResult = 0;
	public static int count_syn__ON__ParseResult = 0;
	public static int count_local__ON__core_parseFailed = 0;
	public static int count_local__ON__core_parseSucceeded = 0;
	public static int count_local__ON__core_parseTreeOrDieWithoutStackTrace = 0;
	public static int count_inh__ON__Maybe = 0;
	public static int count_syn__ON__Maybe = 0;
	public static int count_local__ON__core_just = 0;
	public static int count_local__ON__core_nothing = 0;
	public static int count_local__ON__core_fromMaybe = 0;
	public static int count_local__ON__core_orElse = 0;
public static final int core_fst__ON__core_Pair = core.Init.count_syn__ON__Pair++;
public static final int core_snd__ON__core_Pair = core.Init.count_syn__ON__Pair++;
public static final int i__ON__core_explodeNormal = core.Init.count_local__ON__core_explodeNormal++;
public static final int core_io__ON__core_IOVal = core.Init.count_syn__ON__IOVal++;
public static final int core_iovalue__ON__core_IOVal = core.Init.count_syn__ON__IOVal++;
public static final int indexOfLastSlash__ON__core_dirNameInFilePath = core.Init.count_local__ON__core_dirNameInFilePath++;
public static final int indexOfLastSlash__ON__core_fileNameInFilePath = core.Init.count_local__ON__core_fileNameInFilePath++;
public static final int indexOfLastDot__ON__core_splitFileNameAndExtension = core.Init.count_local__ON__core_splitFileNameAndExtension++;
public static final int recurse__ON__core_partition = core.Init.count_local__ON__core_partition++;
public static final int front_half__ON__core_sortByHelp = core.Init.count_local__ON__core_sortByHelp++;
public static final int back_half__ON__core_sortByHelp = core.Init.count_local__ON__core_sortByHelp++;
public static final int middle__ON__core_sortByHelp = core.Init.count_local__ON__core_sortByHelp++;
public static final int helpercall__ON__core_groupBy = core.Init.count_local__ON__core_groupBy++;
public static final int recurse__ON__core_groupByHelp = core.Init.count_local__ON__core_groupByHelp++;
public static final int core_i_headList__ON__core_List = core.Init.count_syn__ON__List++;
public static final int core_i_tailList__ON__core_List = core.Init.count_syn__ON__List++;
public static final int core_i_emptyList__ON__core_List = core.Init.count_syn__ON__List++;
public static final int core_i_lengthList__ON__core_List = core.Init.count_syn__ON__List++;
public static final int core_parseSuccess__ON__core_ParseResult = core.Init.count_syn__ON__ParseResult++;
public static final int core_parseErrors__ON__core_ParseResult = core.Init.count_syn__ON__ParseResult++;
public static final int core_parseTree__ON__core_ParseResult = core.Init.count_syn__ON__ParseResult++;
public static final int core_fromJust__ON__core_Maybe = core.Init.count_syn__ON__Maybe++;
public static final int core_isJust__ON__core_Maybe = core.Init.count_syn__ON__Maybe++;
}
