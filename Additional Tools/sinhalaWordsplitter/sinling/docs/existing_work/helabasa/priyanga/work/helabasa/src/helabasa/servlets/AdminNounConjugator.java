 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   *    
   * /  
 p a c k a g e   h e l a b a s a . s e r v l e t s ;  
  
 i m p o r t   h e l a b a s a . H B F o r m ;  
 i m p o r t   h e l a b a s a . H B I r r e g u l a r F o r m ;  
 i m p o r t   h e l a b a s a . H B K n o w l e d g e B a s e ;  
 i m p o r t   h e l a b a s a . n o u n s . H B N o u n ;  
 i m p o r t   h e l a b a s a . s e r v l e t s . u t i l s . A d m i n L o g i n ;  
  
 i m p o r t   j a v a . i o . P r i n t W r i t e r ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e q u e s t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e s p o n s e ;  
  
 p u b l i c   c l a s s   A d m i n N o u n C o n j u g a t o r   e x t e n d s   N o u n C o n j u g a t o r   {  
  
 	 / * *  
 	   *    
 	   * /  
 	 p r i v a t e   s t a t i c   f i n a l   l o n g   s e r i a l V e r s i o n U I D   =   1 5 3 5 8 2 6 2 8 3 3 4 8 7 4 9 9 6 4 L ;  
 	  
 	  
 	 p u b l i c   A d m i n N o u n C o n j u g a t o r ( )   {  
  
 	 }  
  
 	 p r o t e c t e d   S t r i n g   G e t A c t i o n P a g e ( )  
 	 {  
 	 	 r e t u r n     " c o n j u g a t o r _ a d m i n " ;  
 	 }  
 	  
 	 p r o t e c t e d   S t r i n g   G e t M a n u a l I n p u t A c t i o n P a g e ( )  
 	 {  
 	 	 r e t u r n   " k b _ m a n " ;  
 	 }  
 	  
 	 p r o t e c t e d   S t r i n g   G e t C o n f i r m B u t t o n ( )  
 	 {  
 	 	 r e t u r n     " < i n p u t   t y p e = ' s u b m i t '   v a l u e = ' C o n f i r m '   i d = ' t C o n f '   n a m e = ' t C o n f ' >   < i n p u t   t y p e = ' s u b m i t '   v a l u e = ' C o n f i r m   a n d   O v e r w r i t e '     i d = ' t O v e r w r i t e '   n a m e = ' t O v e r w r i t e ' >     < i n p u t   t y p e = ' b u t t o n '   o n c l i c k = ' o n S e l l e c t A l l ( ) '   v a l u e = ' S e l l e c t   A l l ' > " ;  
 	 } 	 	  
 	  
 	 p r o t e c t e d   S t r i n g   G e t T i t l e L i n e ( )  
 	 {  
 	 	 r e t u r n   " < h 2   a l i g n = ' c e n t e r ' > H e l a b a s a < / h 2 >   < h 3   a l i g n = ' c e n t e r ' > < a   h r e f = ' . / a d m i n _ p a g e ' > S i n h a l a   M o r p h o l o g i c a l   T o o l s   C o l l e c t i o n   -   A d m i n   C o n s o l e < / a > < / h 3 > " ;  
 	 }  
 	  
 	 p r o t e c t e d   S t r i n g   G e t F o o t e r ( H t t p S e r v l e t R e q u e s t   o R e q )  
 	 {  
 	 	 r e t u r n     A d m i n L o g i n . G e t L o g o u t P a n e l ( o R e q ) ;  
 	 }  
 	  
 	 p r o t e c t e d   b o o l e a n   V e r i f y U s e r ( H t t p S e r v l e t R e q u e s t   o R e q ,   H t t p S e r v l e t R e s p o n s e   o R e s )  
 	 { 	 	  
 	 	 t r y  
 	 	 {  
 	 	 	 r e t u r n   A d m i n L o g i n . V e r i f y ( o R e q ,   o R e s ) ;  
 	 	 }  
 	 	 c a t c h   ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 r e t u r n   f a l s e ;  
 	 	 }  
 	 }  
 	  
         p r o t e c t e d   v o i d   P r i n t N o u n ( P r i n t W r i t e r   o u t ,   H B N o u n   o N o u n ,   l o n g   l L e m m a I D )  
         {          
         	 S t r i n g   s L e m m a   =   o N o u n . G e t L e m m a ( ) . G e t N a t u r a l F o r m ( ) ;  
         	 o u t . p r i n t l n ( " < t r > < t d   b g c o l o r = ' # 3 3 3 3 3 3 ' > < f o n t   c o l o r = ' # f f f f f f ' >�� ���� < / f o n t > < / t d > " ) ;    
         	 P r i n t R e s u l t s C e l l ( o u t ,   s L e m m a ,   l L e m m a I D ,   o N o u n . G e t N o u n F o r m s ( 0 ,   0 ) ,   " F 0 0 " ) ;  
         	 P r i n t R e s u l t s C e l l ( o u t ,   s L e m m a ,   l L e m m a I D ,   o N o u n . G e t N o u n F o r m s ( 0 ,   1 ) ,   " F 0 1 " ) ;  
         	 P r i n t R e s u l t s C e l l ( o u t ,   s L e m m a ,   l L e m m a I D ,   o N o u n . G e t N o u n F o r m s ( 0 ,   2 ) ,   " F 0 2 " ) ;  
         	 o u t . p r i n t l n ( " < / t r > < t r > < t d   b g c o l o r = ' # 3 3 3 3 3 3 ' > < f o n t   c o l o r = ' # f f f f f f ' >���� < / f o n t > < / t d > " ) ; 	 	  
         	 P r i n t R e s u l t s C e l l ( o u t ,   s L e m m a ,   l L e m m a I D ,   o N o u n . G e t N o u n F o r m s ( 1 ,   0 ) ,   " F 1 0 " ) ;  
         	 P r i n t R e s u l t s C e l l ( o u t ,   s L e m m a ,   l L e m m a I D ,   o N o u n . G e t N o u n F o r m s ( 1 ,   1 ) ,   " F 1 1 " ) ;  
         	 P r i n t R e s u l t s C e l l ( o u t ,   s L e m m a ,   l L e m m a I D ,   o N o u n . G e t N o u n F o r m s ( 1 ,   2 ) ,   " F 1 2 " ) ;  
         	 o u t . p r i n t l n ( " < / t r > < t r > < t d   b g c o l o r = ' # 3 3 3 3 3 3 ' > < f o n t   c o l o r = ' # f f f f f f ' >���� < / f o n t > < / t d > " ) ;  
         	 P r i n t R e s u l t s C e l l ( o u t ,   s L e m m a ,   l L e m m a I D ,   o N o u n . G e t N o u n F o r m s ( 8 ,   0 ) ,   " F 8 0 " ) ;  
         	 P r i n t R e s u l t s C e l l ( o u t ,   s L e m m a ,   l L e m m a I D ,   o N o u n . G e t N o u n F o r m s ( 8 ,   1 ) ,   " F 8 1 " ) ;  
         	 P r i n t R e s u l t s C e l l ( o u t ,   s L e m m a ,   l L e m m a I D ,   o N o u n . G e t N o u n F o r m s ( 8 ,   2 ) ,   " F 8 2 " ) ; 	  
         	 o u t . p r i n t l n ( " < / t r > " ) ;  
  
         } 	  
 	  
         p r o t e c t e d   v o i d   P r i n t R e s u l t s C e l l ( P r i n t W r i t e r   o u t ,   S t r i n g   s L e m m a ,   l o n g   l L e m m a I D ,   L i s t < H B F o r m >   l i s t F o r m s ,   S t r i n g   s C o n t r o l N a m e )  
         {        
         	 i n t   i S t a t u s   =   H B K n o w l e d g e B a s e . S T A T U S _ U N K O W N ;  
         	  
         	 i f ( l L e m m a I D > 0 )  
         	 {  
         	 	 i S t a t u s   =   H B K n o w l e d g e B a s e . S T A T U S _ C O N F I R M E D ;  
         	 }  
         	  
         	 o u t . p r i n t l n ( " < t d   c e l l p a d d i n g = ' 0 '     c e l l s p a c i n g = ' 0 ' > " ) ;  
         	 S t r i n g B u f f e r   s b O u t   =   n e w   S t r i n g B u f f e r ( ) ;  
         	 i f ( l i s t F o r m s ! = n u l l )  
         	 {         	 	  
 	 	 	 i n t   i C o u n t   =   l i s t F o r m s . s i z e ( ) ; 	 	  
 	 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 	 { 	 	 	 	  
 	 	 	 	 H B F o r m   o F o r m   =   l i s t F o r m s . g e t ( i ) ; 	 	 	 	    
 	 	 	 	 S t r i n g   s S u f f i x   =   o F o r m . G e t M o d i f i e r ( ) ;  
 	 	 	 	 S t r i n g   s N o u n   =   o F o r m . G e t N a t u r a l F o r m ( ) ;  
 	 	 	 	  
 	 	 	 	 i f ( i = = i C o u n t - 1 )  
 	 	 	 	 {  
 	 	 	 	 	 s b O u t . a p p e n d ( s N o u n ) ; 	 	 	 	 	  
 	 	 	 	 }  
 	 	 	 	 e l s e  
 	 	 	 	 {  
 	 	 	 	 	 s b O u t . a p p e n d ( s N o u n ) . a p p e n d ( " ,   " ) ; 	 	 	 	 	  
 	 	 	 	 }  
 	 	 	 	  
 	 	 	 	 i f ( i S t a t u s   <   2   & &   o F o r m . G e t F o r m T y p e ( ) = = H B I r r e g u l a r F o r m . F O R M _ T Y P E _ I R R E G U L A R )  
 	 	 	 	 {  
 	 	 	 	 	 i S t a t u s   =   H B K n o w l e d g e B a s e . S T A T U S _ O V E R W R I T T E N ;  
 	 	 	 	 }  
 	 	 	 } 	 	 	  
         	 }  
         	 o u t . p r i n t l n ( G e t T e x t B o x ( " t " ,   s C o n t r o l N a m e ,   s b O u t . t o S t r i n g ( ) ,   2 0 ,   i S t a t u s ) ) ;  
 	 	 / / o u t . p r i n t l n ( " < / t e x t a r e a > < i n p u t   t y p e = ' c h e c k b o x '   v a l u e = ' " +   s C o n t r o l N a m e   +   " ' > < / t d > " ) ;  
         	 o u t . p r i n t l n ( " < i n p u t   t y p e = ' c h e c k b o x '   v a l u e = ' " +   s C o n t r o l N a m e   +   " '   i d = ' c " +   s C o n t r o l N a m e   +   " '   n a m e = ' c " +   s C o n t r o l N a m e   +   " ' > < / t d > " ) ;  
         }   	  
          
         p r i v a t e   S t r i n g   G e t T e x t B o x ( S t r i n g   s P r e f i x ,   S t r i n g   s N a m e ,   S t r i n g   s V a l u e ,   i n t   i W i d t h ,   i n t   i S t a t u s )  
         {  
         	 i f ( i S t a t u s   = =   H B K n o w l e d g e B a s e . S T A T U S _ C O N F I R M E D )  
         	 {  
         	 	 r e t u r n   " < i n p u t   s i z e = " + i W i d t h + "   b o r d e r = ' 0 '   i d = ' "   +   s P r e f i x   +   s N a m e   +   " '   n a m e = ' "   +   s P r e f i x   +   s N a m e   +   " '   v a l u e = ' "   +   s V a l u e   +   " '   s t y l e = ' b a c k g r o u n d - c o l o r :   " + S _ C O L O R _ C O N F I R M + " ; '   > " ;  
         	 }  
         	 e l s e   i f ( i S t a t u s   = =   H B K n o w l e d g e B a s e . S T A T U S _ O V E R W R I T T E N )  
         	 {  
         	 	 r e t u r n   " < i n p u t   s i z e = " + i W i d t h + "   b o r d e r = ' 0 '   i d = ' "   +   s P r e f i x   +   s N a m e   +   " '   n a m e = ' "   +   s P r e f i x   +   s N a m e   +   " '   v a l u e = ' "   +   s V a l u e   +   " '   s t y l e = ' b a c k g r o u n d - c o l o r :   " + S _ C O L O R _ O V E R _ W R I T T E N + " ; '   > " ;  
         	 }  
         	 e l s e  
         	 	 r e t u r n   " < i n p u t   s i z e = " + i W i d t h + "   b o r d e r = ' 0 '   i d = ' "   +   s P r e f i x   +   s N a m e   +   " '   n a m e = ' "   +   s P r e f i x   +   s N a m e   +   " '   v a l u e = ' "   +   s V a l u e   +   " '   > " ;         	 	  
         }  
          
  
          
 	 p r o t e c t e d   S t r i n g   G e t S c r i p t s ( )  
 	 { 	 	  
 	 	 r e t u r n     " < s c r i p t   l a n g u a g e = ' j a v a s c r i p t ' > \ n   v a r   b S e l e c t e d   =   f a l s e ; " 	 	 	 	  
 	 	 	 	 +   " f u n c t i o n   o n S e l l e c t A l l ( )   {   \ n "    
 	 	 	 	 +   " i f ( b S e l e c t e d = = f a l s e )   {   \ n "  
 	 	 	 	 +   " b S e l e c t e d   =   t r u e ; \ n "  
 	 	 	 	 +   " U p d a t e E n t r y ( ' F 0 0 ' ,   b S e l e c t e d ) ;   U p d a t e E n t r y ( ' F 0 1 ' ,   b S e l e c t e d ) ;   U p d a t e E n t r y ( ' F 0 2 ' ,   b S e l e c t e d ) ;   \ n "  
 	 	 	 	 +   " U p d a t e E n t r y ( ' F 1 0 ' ,   b S e l e c t e d ) ;   U p d a t e E n t r y ( ' F 1 1 ' ,   b S e l e c t e d ) ;   U p d a t e E n t r y ( ' F 1 2 ' ,   b S e l e c t e d ) ;   \ n "  
 	 	 	 	 +   " U p d a t e E n t r y ( ' F 8 0 ' ,   b S e l e c t e d ) ;   U p d a t e E n t r y ( ' F 8 1 ' ,   b S e l e c t e d ) ;   U p d a t e E n t r y ( ' F 8 2 ' ,   b S e l e c t e d ) ;   \ n " 	 	 	 	 	 	 	 	  
 	 	 	 	 +   " }   \ n   e l s e   {   \ n "  
 	 	 	 	 +   " b S e l e c t e d   =   f a l s e ; " 	 	 	 	  
 	 	 	 	 +   " U p d a t e E n t r y ( ' F 0 0 ' ,   b S e l e c t e d ) ;   U p d a t e E n t r y ( ' F 0 1 ' ,   b S e l e c t e d ) ;   U p d a t e E n t r y ( ' F 0 2 ' ,   b S e l e c t e d ) ;   \ n "  
 	 	 	 	 +   " U p d a t e E n t r y ( ' F 1 0 ' ,   b S e l e c t e d ) ;   U p d a t e E n t r y ( ' F 1 1 ' ,   b S e l e c t e d ) ;   U p d a t e E n t r y ( ' F 1 2 ' ,   b S e l e c t e d ) ;   \ n "  
 	 	 	 	 +   " U p d a t e E n t r y ( ' F 8 0 ' ,   b S e l e c t e d ) ;   U p d a t e E n t r y ( ' F 8 1 ' ,   b S e l e c t e d ) ;   U p d a t e E n t r y ( ' F 8 2 ' ,   b S e l e c t e d ) ;   \ n " 	 	 	 	  
 	 	 	 	 +   " } \ n   } "    
 	 	 	 	 +   " f u n c t i o n   U p d a t e E n t r y ( s I D ,   b V a l )   {   i f (   d o c u m e n t . g e t E l e m e n t B y I d ( ' t ' + s I D ) . v a l u e   ! =   ' ' )   {   "  
 	 	 	 	 +   " d o c u m e n t . g e t E l e m e n t B y I d ( ' c ' + s I D ) . c h e c k e d   =   b V a l ; "  
 	 	 	 	 +   "   }   e l s e   {   d o c u m e n t . g e t E l e m e n t B y I d ( ' c ' + s I D ) . c h e c k e d   =   f a l s e ; }   } "    
 	 	 	 	 +   " \ n < / s c r i p t > \ n " ;  
 	 } 	  
 	  
 }  
