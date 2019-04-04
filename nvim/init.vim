call plug#begin('~/.local/share/nvim/plugged')

Plug 'morhetz/gruvbox'
Plug 'jiangmiao/auto-pairs'
Plug 'janet-lang/janet.vim'

call plug#end()

colorscheme gruvbox

set tabstop=4
set softtabstop=4
set expandtab

set number

noremap <Up> <NOP>
noremap <Down> <NOP>
noremap <Left> <NOP>
noremap <Right> <NOP>
