# -*- mode: python ; coding: utf-8 -*-
from kivy_deps import sdl2, glew


block_cipher = None


a = Analysis(['KyivCityGuide.py'],
             pathex=['C:\\Users\\illuh\\Desktop\\Proga\\Python Projects\\KyivGuide\\kyivguide'],
             binaries=[],
             datas=[],
             hiddenimports=[],
             hookspath=[],
             runtime_hooks=[],
             excludes=[],
             win_no_prefer_redirects=False,
             win_private_assemblies=False,
             cipher=block_cipher,
             noarchive=False)
pyz = PYZ(a.pure, a.zipped_data,
             cipher=block_cipher)
exe = EXE(pyz, Tree('C:\\Users\\illuh\\Desktop\\Proga\\Python Projects\\KyivGuide\\kyivguide'),
          a.scripts,
          a.binaries,
          a.zipfiles,
          a.datas,
          *[Tree(p) for p in (sdl2.dep_bins + glew.dep_bins)],
          name='KyivCityGuide',
          debug=False,
          strip=False,
          upx=True,
          console=False , icon='guide.ico')