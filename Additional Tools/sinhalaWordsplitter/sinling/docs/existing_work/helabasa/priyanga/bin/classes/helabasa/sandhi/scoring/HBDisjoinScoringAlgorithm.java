 p a c k a g e   h e l a b a s a . s a n d h i . s c o r i n g ;  
  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 i m p o r t   h e l a b a s a . H B C o r p u s ;  
 i m p o r t   h e l a b a s a . H B W o r d ;  
 i m p o r t   h e l a b a s a . H e l a b a s a ;  
 i m p o r t   h e l a b a s a . s a n d h i . H B J o i n R e s u l t s ;  
 i m p o r t   h e l a b a s a . s a n d h i . H B J o i n R e s u l t s S e t ;  
  
 p u b l i c   c l a s s   H B D i s j o i n S c o r i n g A l g o r i t h m   i m p l e m e n t s   H B J o i n S c o r i n g A l g o r i t h m   {  
  
 	 p r i v a t e   s t a t i c   f i n a l   i n t   A I D _ J O I N _ F R E Q _ B A S E D _ S C O R I N G   =   1 ;  
 	  
 	  
 	 p u b l i c   H B D i s j o i n S c o r i n g A l g o r i t h m ( )   {  
 	 	  
 	 }  
 	  
 	 @ O v e r r i d e  
 	 p u b l i c   S t r i n g   G e t N a m e ( )  
 	 {  
 	 	 r e t u r n   " D i s j o i n   S c o r i n g " ;  
 	 }  
  
 	 p u b l i c   i n t   G e t I D ( )  
 	 {  
 	 	 r e t u r n   A I D _ J O I N _ F R E Q _ B A S E D _ S C O R I N G ;  
 	 }  
 	  
 	 @ O v e r r i d e  
 	 p u b l i c   v o i d   E v a l u a t e ( H B J o i n R e s u l t s S e t   o R e s u l t s S e t )    
 	 { 	 	  
 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " H B B a s i c J o i n S c o r i n g A l g o r i t m : : E v a l u a t e   :   "   +   ( o R e s u l t s S e t . G e t R e s u l t s C o u n t ( ) )   +   "   r e s u l t s . < b r > " ) ;              
 	 	  
 	 	 L i s t < H B W o r d >   l s t R e s u l t s   =   n e w   A r r a y L i s t < H B W o r d > ( ) ;  
 	 	  
 	 	 i n t   i C o u n t   =   o R e s u l t s S e t . G e t R e s u l t s C o u n t ( ) ;  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B J o i n R e s u l t s   r e s u l t s   =   o R e s u l t s S e t . G e t R e s u l t s A t ( i ) ;  
 	 	 	  
 	 	 	 H B W o r d   o W   =   r e s u l t s . G e t R e s u l t ( ) ;  
 	 	  
 	 	 	  
 	 	 	 i f ( o W . G e t L a s t C h a r a c t e r T y p e ( ) = = H B W o r d . H B W _ S W A R A )   / / e n d s   w i t h   i n v a l i d   p i l l a  
 	 	 	 {  
 	 	 	 	 o W . S e t F r e q u e n c y ( - 1 ) ;  
 	 	 	 }  
 / / 	 	 	 e l s e   i f ( )  
 / / 	 	 	 { 	  
 / / 	 	 	 	  
 / / 	 	 	 }  
 	 	 }  
 	 	  
 	 	 o R e s u l t s S e t . G e t A l l R e s u l t s ( l s t R e s u l t s ,   0 ) ;  
 	 	 H B C o r p u s . G e t W o r d F r e q u e n c i e s ( l s t R e s u l t s ) ; 	 	  
 	 }  
  
 }  
