function jyd(a){this.a=a}
function oyd(a){this.a=a}
function age(a){this.a=a}
function nyd(a){HY(a.a,null)}
function ST(a,b){c$(a.wb,b)}
function _fe(a){$Y(new ayd(a.a.a.o,a.a.a.o.n,a.a.a.b))}
function gyd(a,b,c,d,e){this.a=a;this.b=b;this.c=c;this.d=d;this.e=e}
function cyd(a,b,c,d,e,g,i){this.a=a;this.c=b;this.d=c;this.b=d;this.f=e;this.e=g;this.g=i}
function fyd(a){var b,c;HY(a.a,null);rBd(a.b,Rgd(A6e,A6e));b=Hhd();c=new jyd(a.b);a.c?hid(b,a.d,c):hjd(b,a.d,VWb(t9(a.e),1),c)}
function hjd(b,c,d,e){var g,i,j;i=new KFc(b,SUe,'markForDeletion');try{j=JFc(i,TUe,2);YEc(j,UEc(j,UUe));YEc(j,UEc(j,gRe));ZEc(j,c);YEc(j,UEc(j,d));IFc(i,e,(aGc(),_Fc))}catch(a){a=yxc(a);if(XWb(a,255)){g=a;M0c(e,g)}else throw a}}
function _xd(a,b){var c;b>1?(c=Sgd('message.remove.multiple.confirm','Do you really want to remove the {0} selected resources?',LWb(lwc,aBe,1,[tDe+b]))):VWb(No(VWb(a.i.sl(0),349),ZTe),303)._d(hZe)?(c=Sgd('message.remove.single.page.confirm','Do you really want to remove the selected PAGE {0}?',LWb(lwc,aBe,1,[VWb(No(a.q,dIe),1)]))):(c=Sgd(V2e,W2e,LWb(lwc,aBe,1,[VWb(No(a.q,dIe),1)])));return c}
function ayd(a,b,c){Tw();var d,e,g,i,j,k,n,o,p,q,r,s;aZ.call(this);iz(this,650,500);b$(this.wb,nbf);!!this.G&&Bk(rk(this.G,EKe),nbf);YY(this,false);this.a=new _hb;RT(this.a,Rgd(D$e,D$e));this.a.zb=false;Jx(this.a,false);Rx(this.a,'JahiaGxtDeleteItem');BS(this.a,new Azb(0));iz(this.a,650,500);s=new p$;aT(this.a,s);o=new eIc;p=new eIc;for(k=b.i.be();k.he();){j=VWb(k.ie(),349);MWb(o.c,o.d++,j);UHc(p,VWb(No(j,DTe),1))}g=new VT;BS(g,new Jxb);g.jc=0;g.Lc&&sk(fl(ix(g),aHe),false);g.zb=false;this.b=CCd(o);iz(this.b,650,200);aT(g,this.b);aT(this.a,g);r=new Jlb;iz(r,620,100);if(!c){aT(this.a,new q$('<br />'+Rgd(G5e,H5e)+': <br />'));aT(this.a,r)}i=o.d;jq(this.b.H.e,new cyd(this,b,i,g,r,c,s));if(c){n=Rgd(m8e,'<br/><span style="font-style:bold;color:red;">Warning: this will erase the content definitively from the repository<br/>So it will not be displayed anymore anywere<\/span>');aT(this.a,new q$(n));ST(this,(Wnd(),Vnd(),Snd))}q=new YX(Rgd(D6e,D6e),new gyd(this,a,c,p,r));e=new YX(Rgd(E6e,E6e),new oyd(this));d=new J8;y8(d,(ie(),fe));v8(d,q,d.Jb.d);v8(d,e,d.Jb.d);aT(this.a,d);OT(this,d);iS(this,this.a)}
var nbf='Informations';vyc(1561,364,RBe,ayd);_.a=null;_.b=null;vyc(1562,226,kBe,cyd);_.og=function dyd(a){var b,c,d;b=VWb(a.c,303);c=b.Wd();d=_xd(this.c,this.d);if(c>0){d+='<br /><br />'+(this.d>1?Rgd('message.remove.multiple.usage','Those nodes are still used in:'):Rgd('message.remove.single.usage','This node is still used by:'))}else{jT(this.a.a,this.b);jz(this.f,'620','70%');if(this.e){iz(this.a,-1,130);iz(this.a.a,-1,130)}}o$(this.g,d);uS(this.a.a,false)};_.a=null;_.b=null;_.c=null;_.d=0;_.e=false;_.f=null;_.g=null;vyc(1563,237,kBe,gyd);_.tg=function hyd(a){fyd(this,VWb(a,59))};_.a=null;_.b=null;_.c=false;_.d=null;_.e=null;vyc(1564,1201,{},jyd);_.Xl=function kyd(a){qBd(this.a);rb(a.ld(),a);j2(Rgd(ZUe,DNe),a.ld(),null)};_.He=function lyd(a){var b;qBd(this.a);b=new iYc;b.Td(_Ye,(cPc(),cPc(),bPc));vBd(this.a,b);yBd(this.a)};_.a=null;vyc(1565,237,kBe,oyd);_.tg=function pyd(a){nyd(this,VWb(a,59))};_.a=null;vyc(2147,1,PCe);_.Ck=function Zfe(){var a,b,c,d,e;c=this.a.o.n;if(!c.i.Rd()){b=new eIc;for(e=c.i.be();e.he();){d=VWb(e.ie(),349);UHc(b,VWb(No(d,DTe),1))}a=Hhd();Qid(a,b,new age(this))}};vyc(2148,1201,{},age);_.Xl=function bge(a){OAc(q7e+a.ld())};_.He=function cge(a){_fe(this,VWb(a,303))};_.a=null;var zqc=TPc(G9e,'DeleteActionItem$1$1',2148),dhc=TPc(B9e,'DeleteItemWindow',1561),_gc=TPc(B9e,'DeleteItemWindow$1',1562),bhc=TPc(B9e,'DeleteItemWindow$2',1563),ahc=TPc(B9e,'DeleteItemWindow$2$1',1564),chc=TPc(B9e,'DeleteItemWindow$3',1565);fDe(EKb)(3);